import java.util.*;

class Reversal {

    public static void reverse(int arr[], int pos) {
        int flag, start = 0;
        // first part
        while (pos - 1 > start) {
            flag = arr[start];
            arr[start] = arr[pos - 1];
            arr[pos - 1] = flag;
            start++;
        }

        // second part
        start = pos;
        while (arr.length - 1 > pos) {
            flag = arr[pos];
            arr[pos] = arr[pos + 1];
            arr[pos + 1] = flag;
            pos++;
        }
        // rotate the complete array

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    public static void rotate(int[] arr, int start, int end) {

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