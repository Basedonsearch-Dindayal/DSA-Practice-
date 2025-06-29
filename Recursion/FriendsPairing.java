public class FriendsPairing {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(pairCount(n));
    }
    public static int pairCount(int n) {
        if(n==1 || n==2){
            return n;
        }
        int fn1 = pairCount(n-1);

        int fn2 = pairCount(n-2);

        int pairWays = (n-1)*fn2;

        int totalWays = fn1 + pairWays;
        return totalWays;
    }
}
