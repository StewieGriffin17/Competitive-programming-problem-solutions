/* https://leetcode.com/problems/contains-duplicate/ 
The problem is to find duplicate items in an array. It is number 217 problem in leetcode named Contains Duplicate. You can search the problem in leetcode or follow the link above.
*/

import java.util.Arrays;
import java.util.Scanner;

public class contains_duplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = input.nextInt();
        int[] numbers = new int[size];

        // Taking input
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < size; i++){
            numbers[i] = input.nextInt();
        }

        // Creating an instance to call the non static method check.
        contains_duplicate containsDuplicate = new contains_duplicate();
        boolean result = containsDuplicate.check(numbers);
        System.out.println(result);

        input.close();
    }
    public boolean check(int[] nums){
        // Sorting the array
        Arrays.sort(nums);

        // Check for duplicate items
        for (int i = 0; i < nums.length - 1; i++){
            if (nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
}