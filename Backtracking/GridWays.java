public class GridWays {
    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        System.out.print("Totalways are: ");
        // System.out.print(findWays(0, 0, m, n));
        System.out.println(gridPaths(n, m));

    }
    // public static int findWays(int i,int j,int m, int n){
    //     if(i == n-1 && j == m-1){
    //         return 1;
    //     }
    //     else if(i == n || j == m){
    //         return 0;
    //     }
    //     int w1 = findWays(i+1, j, m, n);
    //     int w2 = findWays(i, j+1, m, n);
    //     return w1+w2;
    // }
    // int upValue = m+n-2;
    // int ways = 1;
    // for(i=0;i<=1;i--){
    //     ways = m*ways;

    // }
    // return upValue/ways*ways;
    // }
    public static long factorial(int num) {
    long result = 1;
    for (int i = 2; i <= num; i++) {
        result *= i;
    }
    return result;
    }

    public static long gridPaths(int n, int m) {
    int upValue = n + m - 2;
    int downLeft = n - 1;
    int downRight = m - 1;

    long numerator = factorial(upValue);
    long denominator = factorial(downLeft) * factorial(downRight);

    return numerator / denominator;
   }
}
