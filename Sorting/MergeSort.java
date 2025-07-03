public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {6, 5, 7, 9, 1, 2, 7, 9, 3};
        mergeSort(arr, 0, arr.length - 1);
        printArray(arr);
    }

    public static void mergeSort(int[] arr, int si, int ei) {
        if (ei == si) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);
        merge(arr, si, mid, ei);
    }

    public static void merge(int[] arr, int si, int mid, int ei) {
        int[] newArr = new int[ei - si + 1];
        int i = si, j = mid + 1, k = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                newArr[k++] = arr[i++];
            } else {
                newArr[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            newArr[k++] = arr[i++];
        }
        while (j <= ei) {
            newArr[k++] = arr[j++];
        }

        for (int x = 0; x < newArr.length; x++) {
            arr[si + x] = newArr[x];
        }
    }

    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}