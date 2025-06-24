public class SwapTwoNumber{
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        System.out.println("Before Swap: A = "+a+" and B = "+b);
        Swap(a,b);
    }
    public static void Swap(int a, int b) {
        a = a ^ b;
        b = b ^ a;
        a = a ^ b;
        System.out.println("After Swap: A = "+a+" and B = "+b);
    }
}