package de.thetigerpython;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Challenge {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Please enter your first line: ");
            String firstWord = reader.readLine().trim();

            System.out.println("Please enter your second line: ");
            String secondWord = reader.readLine().trim();

            if (doesRhyme(firstWord, secondWord)) {
                System.out.println("It seems like these two lines rhyme.");
            } else {
                System.out.println("Nope, these two lines don't rhyme at all.");
            }
        } catch (IOException exception) {
            System.err.println("An error occurred while reading input: " + exception.getMessage());
        }
    }

    // Checks if two different words rhyme based on vowels contained in the last word.
    public static boolean doesRhyme(String first, String second) {
        first = extractLastWord(first);
        second = extractLastWord(second);

        return extractVowels(first).equals(extractVowels(second));
    }

    // Extracts the last vowel cluster and any following consonants.
    private static String extractLastWord(String line) {
        line = line.replaceAll("[^a-zA-Z ]", "").toLowerCase();
        String[] words = line.split(" ");
        return words[words.length-1];
    }

    // This will extract all vowels.
    private static String extractVowels(String word) {
        return word.replaceAll("[^aeiou]", "");
    }
}
