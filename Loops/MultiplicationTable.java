import java.util.*;

public class MultiplicationTable {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            int n = sc.nextInt();

            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " X " + i + " = " + (n * i));
            }
        }
    }
}
