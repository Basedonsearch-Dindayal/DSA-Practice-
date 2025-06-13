public class ReverseArray {
    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10};
        reverseArray(number);

        // Print reversed array
        for (int num : number) {
            System.out.print(num + " ");
        }
    }

    public static void reverseArray(int number[]) {
        int first = 0;
        int last = number.length - 1;
        int temp;

        while (first < last) {
            temp = number[first];
            number[first] = number[last];
            number[last] = temp;
            first++;
            last--;
        }
    }
}
