public class CheckPowerOf2 {
    public static void main(String[] args) {
        int bitMask = 32;
        System.out.println(checkPower(bitMask));
    }
    public static boolean checkPower(int bitMask) {
        int n = bitMask;
        return(n&(n-1)) == 0;
    }
}
