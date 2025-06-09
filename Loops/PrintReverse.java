public class PrintReverse{
    public static void main(String[] args) {
        int n = 10899;
        int reversedInt = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            reversedInt = reversedInt * 10 + lastDigit;
            n /= 10;
        }

        System.out.println(reversedInt);
    }
}
