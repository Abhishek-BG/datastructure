
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

    public static boolean findsum(int arr[], int key, int size, int index) {

        int pos = 0;
        if (size > index && pos != index) {
            if (arr[index] + arr[pos] == key) {
                return true;
            }
            return findsum(arr, key, size, index + 1);
        }
        return false;
    }

    public static void main(String[] args) {
        // given array
        int arr[] = { 11, 15, 6, 8, 9, 10 };
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int size = arr.length;
        System.out.println(findsum(arr, key, size, 1));
    }
}