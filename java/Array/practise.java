class NoSort {
    static int arr[] = { 2, 2, 1, 1, 0, 0, 1, 2, 2 };

    public NoSort() {
        int pivot = 0;
        int start = 0;
        int end = arr.length - 1;
        while (pivot <= end) {
            if (arr[pivot] == 0) {
                int temp = arr[pivot];
                arr[pivot] = arr[start];
                arr[start] = temp;
                start++;

            }
            if (arr[pivot] == 2) {
                int temp = arr[pivot];
                arr[pivot] = arr[end];
                arr[end] = temp;
                end--;
            } else {
                pivot++;
            }
        }
    }

    public static void main(String[] args) {
        NoSort obj = new NoSort();
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}