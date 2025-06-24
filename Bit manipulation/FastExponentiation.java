public class FastExponentiation{
    public static int fastExpo(int a , int n) {
        int ans = 1;
        while(n>0){
            int last_bit = n&1;
            if(last_bit == 1){
                ans = ans * a;
            }
            a = a*a;
            n = n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int a = 3;
        int n = 9;
        System.out.println(fastExpo(a, n));
    }
}