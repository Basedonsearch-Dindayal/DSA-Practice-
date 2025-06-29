public class FindLength {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(findLength(str));
    }
    public static int findLength(String str) {
        if(str.length() == 0){
            return 0;
        }
        return findLength(str.substring(1)) + 1;
    }
}
