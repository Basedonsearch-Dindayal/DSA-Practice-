public class Substring {
    public static void main(String[] args) {
        String s = "abcab";
        int n = s.length();
        System.out.println(count(s, 0 , n-1 , n));
    }
    public static int count(String s,int i, int j, int n) {
        if(n == 1){
            return 1;
        }
        if(n <= 0){
            return 0;
        }

        int res = count(s, i+1, j , n-1) + count(s, i, j-1, n-1) - count(s, i+1, j-1, n-2);
        
        if(s.charAt(i) == s.charAt(j)){
            res++;
        }
        return res;
    }

}
