public class FirstOccurrence {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int key = 19;
        int i = 0;
        System.out.println(firstOccurrence(arr, i, key));
    }

    public static int firstOccurrence(int[] arr, int i, int key) {
        if (i >= arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccurrence(arr, i + 1, key);
    }
}
