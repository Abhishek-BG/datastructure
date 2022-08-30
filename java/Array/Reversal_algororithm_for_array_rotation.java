import java.util.*;

class Reversal {

    public static void reverse(int arr[], int pos) {

        // first half rotate
        rotate(arr, 0, pos - 1);
        // second half
        rotate(arr, pos, arr.length - 1);
        // print in reversed order to get rotated array
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    public static void rotate(int[] arr, int start, int end) {

        while (start < end) {
            int flag = arr[start];
            arr[start] = arr[end];
            arr[end] = flag;
            start++;
            end--;

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array_size = scanner.nextInt();
        int array[] = new int[array_size];
        for (int i = 0; i < array_size; i++) {
            array[i] = scanner.nextInt();
        }
        int position = scanner.nextInt();
        reverse(array, position);

    }

}