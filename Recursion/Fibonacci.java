public class Fibonacci {
    public static void main(String[] args) {
        int n = 35;
        int total = fibonacci(n);
        System.out.println(total);
    }
    public static int fibonacci(int n) {
        if(n==0){
            return 0;
        }
        if (n==1) {
            return 1;
        }
        int fib = fibonacci(n-1)+fibonacci(n-2);
        return fib;
    }  
}