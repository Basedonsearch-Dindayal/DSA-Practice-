public class Factorial {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(factorial(n));
    }
    public static int factorial(int n) {
        if(n==1){
            return 1;
        }
        int fn = n*factorial(n-1);
        return fn;
    }
}
