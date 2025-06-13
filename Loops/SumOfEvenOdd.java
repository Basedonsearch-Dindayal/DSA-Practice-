import java.util.Scanner;

public class SumOfEvenOdd {
    public static void main(String[] args) {
        int number;
        int choice;
        int even = 0;
        int odd = 0;

        try (Scanner sc = new Scanner(System.in)) {
            do {
                System.out.print("Enter the number: ");
                number = sc.nextInt();

                if (number % 2 == 0) {
                    even += number;
                } else {
                    odd += number;
                }

                System.out.print("Do you want to continue? Press 1 for Yes or 0 for No: ");
                choice = sc.nextInt();

            } while (choice == 1);

            System.out.println("Sum of even numbers: " + even);
            System.out.println("Sum of odd numbers: " + odd);
        }
    }
}
