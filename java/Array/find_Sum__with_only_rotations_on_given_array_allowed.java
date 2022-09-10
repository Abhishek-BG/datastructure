/*
 * Given an array arr[] of size N, the task is to find the maximum possible sum of i*arr[i] 
 * when the array can be rotated any number of times.

Examples :  

Input: arr[] = {1, 20, 2, 10}
Output: 72.We can get 72 by rotating array twice.
{2, 10, 1, 20}
20*3 + 1*2 + 10*1 + 2*0 = 72

Input: arr[] = {10, 1, 2, 3, 4, 5, 6, 7, 8, 9}
Output: 330
We can get 330 by rotating array 9 times.
{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
0*1 + 1*2 + 2*3 … 9*10 = 330
 */
class find_Sum__with_only_rotations_on_given_array_allowed {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int size = arr.length - 1;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i] * i;
        }
        System.out.println(sum);
    }

}
