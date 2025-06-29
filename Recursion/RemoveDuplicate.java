public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "BBEESSTTTTGAMMMMME";
        System.out.println(removeDuplicate(str));
    }
    public static String removeDuplicate(String str) {
        StringBuilder sb = new StringBuilder();

        if (str == null || str.isEmpty()) {
            return "";
        }
        
        char current = str.charAt(0);
        sb.append(current);
        int n = 0;
        while (n < str.length()) {
            if(current == str.charAt(n)){
            n++;
            }
            else{
                sb.append(str.charAt(n));
                current = str.charAt(n);
                n++;
            }   
        }
        return sb.toString();
    }
}
