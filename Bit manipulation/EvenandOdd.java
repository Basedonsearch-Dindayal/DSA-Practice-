public class EvenandOdd {
    public static void main(String[] args) {
        check(5);
        check(99);
        check(10);
    }

    public static void check(int n) {
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}
