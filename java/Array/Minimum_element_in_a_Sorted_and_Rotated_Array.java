/*
 * Given a sorted array arr[] (may be distinct or may contain duplicates) of size N 
 * that is rotated at some unknown point, The task is to find the minimum element in it. 

Examples: 

Input: arr[] = {5, 6, 1, 2, 3, 4}
Output: 1
Explanation: 1 is the minimum element present in the array.

Input: arr[] = {1, 2, 3, 4}
Output: 1

Input: arr[] = {2, 1}
Output: 1
 */
class Minimum_element_in_a_Sorted_and_Rotated_Array {
    public static void sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length - 1; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 7, 9, 1, 6, 3, 4, 9 };
        sort(arr);
        System.out.print(arr[0] + " ");

    }
}
