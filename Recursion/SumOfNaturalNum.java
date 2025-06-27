public class SumOfNaturalNum {
    public static void main(String[] args) {
        int n = 20;
        System.out.println(sum(n));
    }
    public static int sum(int n) {
        if(n==1){
            return 1;
        }
        int add = n + sum(n-1);
        return add;
    }
}
