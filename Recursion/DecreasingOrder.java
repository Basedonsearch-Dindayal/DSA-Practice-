public class DecreasingOrder{
    public static void main(String[] args) {
        int n = 20;
        decreasingOrder(n);
    }
    public static void decreasingOrder(int n) {
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        decreasingOrder(n-1);
    }
}
