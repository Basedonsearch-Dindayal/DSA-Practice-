public class Add1 {
    public static void main(String[] args) {
        int n = 15;
        add1(n);
    }
    public static void add1(int n) {
        n = -(~n);
        System.out.println(n);
    }
}
