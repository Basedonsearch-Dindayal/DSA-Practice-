import java.util.Scanner;

public class ComplexNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st real number: ");
        int a = sc.nextInt();
        System.out.print("Enter 1st imaginary number: ");
        int b = sc.nextInt();
        System.out.print("Enter 2nd real number: ");
        int c = sc.nextInt();
        System.out.print("Enter 2nd imaginary number: ");
        int d = sc.nextInt();
        add(a, b, c, d);
        subs(a, b, c, d);
        product(a, b, c, d);
    }
    public static void add (int a, int b, int c, int d) {
        int z1 = a+c;
        int z2 = b+d;
        System.out.println("Addition is: "+z1+"+"+z2+"i");
    }
    public static void subs(int a, int b, int c, int d) {
        int z1 = a-c;
        int z2 = b-d;
        System.out.println("Substraction is: "+z1+"+"+z2+"i");
    }
    public static void product(int a, int b, int c, int d) {
        int z1 = (a*c)-(b*d);
        int z2 = (a*d)+(b*c);
        System.out.println("Product is: "+z1+"+"+z2+"i");
    }
}
