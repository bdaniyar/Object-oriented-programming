package io.app;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordFrequencyAppPr2 {
    public static void main(String[] args) {
        Map<String, Integer> wordCount = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("/Users/daniarboranov/Documents/code_materials/OOP/pr5/input.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // remove punctuation and make lowercase
                line = line.replaceAll("[^a-zA-Z0-9 ]", "").toLowerCase();
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        // sort by frequency (descending)
        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(wordCount.entrySet());
        sortedList.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        try (PrintWriter writer = new PrintWriter(new FileWriter("report.txt"))) {
            for (Map.Entry<String, Integer> entry : sortedList) {
                writer.println(entry.getKey() + " : " + entry.getValue());
            }
            System.out.println("Report generated: report.txt");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}
