/*Q33.File Handling in Java:
Write a java file handling program to count and display the number of
palindromes present in a text file "myfile.txt".
Example: If the file "myfile.txt" contains the following lines,
My name is NITIN
Hello aaa and bbb wordHow are You
ARORA is my friendOutput will be => 4*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PalindromeCounter {
    public static void main(String[] args) {
        String filename = "myfile.txt"; // Name of the file to be read

        try (BufferedReader br = new BufferedReader(new FileReader("myfile.txt"))) {
            String line;
            int palindromeCount = 0;

            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+"); // Split the line into words
                for (String word : words) {
                    if (isPalindrome(word)) {
                        palindromeCount++;
                    }
                }
            }

            System.out.println("Number of palindromes in the file: " + palindromeCount);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }

    // Method to check if a string is a palindrome
    private static boolean isPalindrome(String str) {
        str = str.toLowerCase(); // Convert to lowercase for case-insensitive comparison
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}