import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        int[] number = {2, 4, 6, 8, 10, 12, 14};

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter key to search: ");
            int key = sc.nextInt();

            int result = binarySearch(number, key);
            if (result == -1)
                System.out.println("Key not found.");
            else
                System.out.println("Index for key is: " + result);
        sc.close();        
        }

    public static int binarySearch(int[] arr, int key) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key) return mid;
            if (key > arr[mid]) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }
}
