package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ExeArgs {
    static boolean isNumber(String strNum) {
        try {
            Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    static List<Integer> processNumbers(List<Integer> numbers) {
        if (numbers.size() % 2 == 0) {
            return numbers.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
        }
        return numbers.stream().filter(num -> num % 2 != 0).collect(Collectors.toList());
    }

    static void outputResult(List<Integer> result, String outputFile) {
        if (outputFile != null) {
            if (!outputFile.endsWith(".txt")) {
                outputFile += ".txt";
            }
            try {
                Files.write(Paths.get(outputFile), (Iterable<String>)result.stream().map(Object::toString)::iterator);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println(result.stream().map(Object::toString).collect(Collectors.joining(" ")));
        }
    }

    static void readFromStdin(String outputFile) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter each number: ");
        String numbersString = scanner.nextLine();
        List<Integer> numbers = Arrays.stream(numbersString.trim().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> result = processNumbers(numbers);
        outputResult(result, outputFile);
        System.out.print("Click Enter for finishing... ");
        scanner.nextLine();
        scanner.close();
    }

    static void readFromFile(String inputFile, String outputFile) {
        try {
            String content = new String(Files.readAllBytes(Paths.get(inputFile)));
            List<Integer> numbers = Arrays.stream(content.split("\\s+"))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            List<Integer> result = processNumbers(numbers);
            outputResult(result, outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter args: ");
        String arguments = scanner.nextLine();
        String[] inputArgs = arguments.trim().split("\\s+");
        String input = inputArgs.length > 0 ? inputArgs[0] : null;
        String output = inputArgs.length > 1 ? inputArgs[1] : null;

        if (input == null || isNumber(input)) {
            readFromStdin(output);
        } else {
            readFromFile(input, output);
        }
        scanner.close();
    }
}