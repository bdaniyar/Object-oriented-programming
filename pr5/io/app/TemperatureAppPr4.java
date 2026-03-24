package io.app;

import java.io.*;
import java.util.Random;

public class TemperatureAppPr4 {

    public static void main(String[] args) {

        String path = "sensor.bin";
        Random random = new Random();

        // 1. CREATE binary file (60 doubles)
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(path))) {

            for (int i = 0; i < 60; i++) {
                double temp = 15.0 + (35.0 - 15.0) * random.nextDouble();
                dos.writeDouble(temp);
            }

            System.out.println("File created: sensor.bin");

        } catch (IOException e) {
            System.out.println("Write error: " + e.getMessage());
        }

        // 2. PATCH (30th element → 999.9)
        try (RandomAccessFile raf = new RandomAccessFile(path, "rw")) {

            raf.seek(29 * 8);
            raf.writeDouble(999.9);

            System.out.println("Patched index 29 (30th value)");

        } catch (IOException e) {
            System.out.println("Patch error: " + e.getMessage());
        }

        // 3. READ + calculate avg & max
        double sum = 0;
        double max = Double.MIN_VALUE;
        int count = 0;

        try (DataInputStream dis = new DataInputStream(new FileInputStream(path))) {

            while (dis.available() > 0) {
                double temp = dis.readDouble();

                sum += temp;
                if (temp > max) {
                    max = temp;
                }

                count++;
            }

        } catch (IOException e) {
            System.out.println("Read error: " + e.getMessage());
        }

        double average = sum / count;

        System.out.println("Average: " + average);
        System.out.println("Max: " + max);
    }
}