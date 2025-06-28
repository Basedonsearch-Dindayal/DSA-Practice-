public class OptimalPower{
    public static void main(String[] args) {
        int num = 2;
        int pow = 20;
        System.out.println(optimalPower(num, pow));
    }
    public static int optimalPower(int num,int pow) {
        if(pow == 0){
            return 1;
        }
        int halfPower = optimalPower(num,pow/2);
        halfPower = halfPower*halfPower;
        if(pow%2 != 0){
            halfPower = num * halfPower;
        }
        return halfPower;
    }
}