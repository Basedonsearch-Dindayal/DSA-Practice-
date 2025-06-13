import java.util.Scanner;
import java.math.BigInteger;

public class PrintFactorial {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter any positive integer: ");
            int num = sc.nextInt();

            BigInteger fact = BigInteger.ONE;

            for (int i = 1; i <= num; i++) {
                fact = fact.multiply(BigInteger.valueOf(i));
            }

            System.out.println("Factorial of " + num + " is: " + fact);
        }
    }
}
