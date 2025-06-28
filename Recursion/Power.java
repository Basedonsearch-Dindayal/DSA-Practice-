public class Power{
    public static void main(String[] args) {
        int num = 2;
        int pow = 10;
        System.err.println(power(num, pow));
    }
    public static int power(int num, int pow){
        if(pow == 1){
            return num;
        }
        return num * power(num, pow-1);
    }
}