// Write a program that reads a set of integers, and then prints the sum of the even and odd integers
import java.util.Scanner;
public class SumOfEvenOdd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        int choice;
        int even = 0;
        int odd = 0;

        do{
            System.out.print("Enter the number: ");
            number = sc.nextInt();

            if(number % 2 == 0){
                even = even + number;
            }else{
                odd = odd + number;
            }
            
            System.out.print("Do you want to continue? press 1 for Yes or 0 for No: ");
            
            choice = sc.nextInt();

        }while(choice == 1);

        System.out.println("sum of the even numbers:" + even);
        System.out.println("sum of the odd numbers:" + odd);
    }
}