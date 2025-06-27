public class IncreasingOrder {
    public static void main(String[] args) {
        int n = 20;
        increase(n);
    }
    public static void increase(int n) {
        if(n==1){
            System.out.print(1+" ");
            return;
        }
        increase(n-1);
        System.out.print(n+" ");
    }
}
