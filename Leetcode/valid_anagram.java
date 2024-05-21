/* https://leetcode.com/problems/valid-anagram/description/
    The problem is to check if two given string is a valid anagram or not. This is number 242 problem in leetcode.
 */

import java.util.Arrays;
import java.util.Scanner;

public class valid_anagram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input
        System.out.println("Enter first string: ");
        String first = input.nextLine();
        System.out.println("Enter second string: ");
        String second = input.nextLine();

        // Creating an instance
        valid_anagram validAnagram = new valid_anagram();
        boolean result = validAnagram.isAnagram(first, second);
        System.err.println(result);

        input.close();
    }
    public boolean isAnagram(String first, String second){
        // Converting given strings to array
        char[] fisrt_char = first.toCharArray();
        char[] second_char = second.toCharArray();

        // Sorting arrays for comparison
        Arrays.sort(fisrt_char);
        Arrays.sort(second_char);
        
        // Checking if the sorted arrays are equal or not
        boolean areEqual = Arrays.equals(fisrt_char, second_char);
        return areEqual;
    }
}
