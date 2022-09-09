
/*
 * Given a sorted and rotated array arr[] of size N and a key, the task is to find the key in the array.

Note: Find the element in O(logN) time and assume that all the elements are distinct.

Example:  

Input  : arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3}, key = 3
Output : Found at index 8

Input  : arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3}, key = 30
Output : Not found

Input : arr[] = {30, 40, 50, 10, 20}, key = 10   
Output : Found at index 3
 */
import java.util.*;

class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Size = sc.nextInt();
        Queue<Integer> arr = new LinkedList<>();
        for (int i = 0; i < Size; i++) {
            int value = sc.nextInt();
            arr.add(value);

        }
        System.out.println("Enter the rotate pos");
        int pos = sc.nextInt();
        for (int i = 0; i < pos; i++) {
            int temp = arr.remove();
            arr.add(temp);
        }
        System.out.println(arr);
        System.out.println("Enter the serach pos");
        pos = sc.nextInt();
        int count = 0;
        for (int i : arr) {
            if (pos == i) {
                break;
            }
            count += 1;
        }
        System.out.println("Element found at pos: " + count);
    }

}