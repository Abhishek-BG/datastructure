
/*
 * Given an array arr[] of distinct elements size N that is sorted and then around an unknown point, 
 * the task is to check if the array has a pair with a given sum X.

Examples : 

Input: arr[] = {11, 15, 6, 8, 9, 10}, X = 16
Output: true
Explanation: There is a pair (6, 10) with sum 16

Input: arr[] = {11, 15, 26, 38, 9, 10}, X = 35
Output: true
Explanation: There is a pair (26, 9) with sum 35

Input: arr[] = {11, 15, 26, 38, 9, 10}, X = 45
Output: false
Explanation: There is no pair with sum 45
 */
import java.lang.reflect.Array;
import java.util.*;

class sumarray {
    public static void main(String[] args) {
        // given array
        int arr[] = { 11, 15, 6, 8, 9, 10 };
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int index = 0;

        boolean value = false;
        for (int i = 1; i < arr.length; i++) {
            index = i;
            int left = index - 1;
            int right = index + 1;
            while (left >= 0) {
                if (arr[index] + arr[left] == key) {
                    System.out.println(arr[index] + "+" + arr[left]);
                    value = true;
                }
                left -= 1;

            }
            while (right < arr.length) {
                if (arr[index] + arr[right] == key) {
                    System.out.println(arr[index] + "+" + arr[right]);
                    value = true;
                }
                right += 1;
            }
        }

        System.out.println(value);
    }
}