/*
 * Given an array of integers arr[] of size N and an integer, the task is to
 * rotate the array elements to the left by d positions.
 */

import java.util.*;

class MyArray {
    public static void rotate(int arr[], int n) {
        int a = 0;
        int temp_array[] = new int[100];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = n; i < arr.length; i++) {
            temp_array[a] = arr[i];
            a++;
        }
        for (int i = 0; i < n; i++) {
            temp_array[a] = arr[i];
            a++;
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(temp_array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int array_size;
        Scanner sc = new Scanner(System.in);
        array_size = sc.nextInt();
        int array[] = new int[array_size];
        for (int i = 0; i < array_size; i++) {
            array[i] = sc.nextInt();
        }
        int position = sc.nextInt();
        rotate(array, position);

    }
}