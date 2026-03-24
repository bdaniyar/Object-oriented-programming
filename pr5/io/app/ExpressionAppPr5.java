package io.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class ExpressionAppPr5 {
    public static void main(String[] args) {

        String input = "/Users/daniarboranov/Documents/code_materials/OOP/pr5/expressions.txt";
        String results = "results.txt";
        String log = "log.txt";

        try (
            BufferedReader reader = new BufferedReader(new FileReader(input));
            PrintWriter resultWriter = new PrintWriter(new FileWriter(results));
            PrintWriter logWriter = new PrintWriter(new FileWriter(log))
        ) {

            String line;

            while ((line = reader.readLine()) != null) {

                try {
                    // parse expression
                    StringTokenizer tokenizer = new StringTokenizer(line, "+-*/", true);

                    String first = tokenizer.nextToken();
                    String operator = tokenizer.nextToken();
                    String second = tokenizer.nextToken();

                    double a = Double.parseDouble(first);
                    double b = Double.parseDouble(second);

                    double res;

                    switch (operator) {
                        case "+":
                            res = a + b;
                            break;
                        case "-":
                            res = a - b;
                            break;
                        case "*":
                            res = a * b;
                            break;
                        case "/":
                            res = a / b;
                            break;
                        default:
                            throw new UnsupportedOperationException("Invalid operator");
                    }

                    resultWriter.println(line + " = " + res);

                } catch (NoSuchElementException e) {
                    logWriter.println("Missing operand: " + line);

                } catch (NumberFormatException e) {
                    logWriter.println("Invalid number: " + line);

                } catch (UnsupportedOperationException e) {
                    logWriter.println("Unsupported operator: " + line);
                }
            }

            System.out.println("Processing complete.");

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}
