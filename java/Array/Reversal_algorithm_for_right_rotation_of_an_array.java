
/*Examples: 

Input: arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
          k = 3
Output: 8 9 10 1 2 3 4 5 6 7

Input: arr[] = {121, 232, 33, 43 ,5}
           k = 2
Output: 43 5 121 232 33
 * 
 */
import java.util.*;

class Reversal_algorithm_for_right_rotation_of_an_array {
    public static void rightrotate(int arr[], int key) {
        int size = arr.length;
        rotate(arr, size - key, size - 1);
        rotate(arr, 0, size - key - 1);
        rotate(arr, 0, size - 1);

    }

    public static void rotate(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        rightrotate(arr, key);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
