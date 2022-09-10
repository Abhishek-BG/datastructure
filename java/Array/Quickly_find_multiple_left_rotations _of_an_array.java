
/*
 * iven an array of size n and multiple values around which we need to left
 *  rotate the array. How to quickly find multiple left rotations?

Examples: 

Input : arr[] = {1, 3, 5, 7, 9}
        k1 = 1
        k2 = 3
        k3 = 4
        k4 = 6
Output : 3 5 7 9 1
         7 9 1 3 5
         9 1 3 5 7
         3 5 7 9 1

Input : arr[] = {1, 3, 5, 7, 9}
        k1 = 14 
Output : 9 1 3 5 7
 */
import java.util.*;

class Quickly_find_multiple_left_rotations_of_an_array {

    public static void leftrotate(int arr[], int size, int pos) {
        int rem = pos % size;
        rotate(arr, 0, rem - 1);
        rotate(arr, pos, size);
        rotate(arr, 0, size);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void rotate(int arr[], int start, int pos) {
        while (start < pos) {
            int temp = arr[start];
            arr[start] = arr[pos];
            arr[pos] = temp;
            start++;
            pos--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 7, 9 };
        int size = arr.length;
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int karr[] = new int[k];
        for (int i = 0; i < k; i++) {
            System.out.print("K" + (i + 1) + ":");
            int data = sc.nextInt();
            karr[i] = data;
            System.out.println();
        }
        for (int i = 0; i < k; i++) {
            leftrotate(arr, size - 1, karr[i]);
        }
    }
}
