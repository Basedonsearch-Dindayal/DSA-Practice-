public class StringCompression {
    public static void main(String[] args) {
        String str = "aaabbbcccdde";
        System.out.println(compressString(str));
    }

    public static String compressString(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        StringBuilder sb = new StringBuilder();
        int count = 1;
        char currentChar = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == currentChar) {
                count++;
            } else {
                sb.append(currentChar).append(count);
                currentChar = str.charAt(i);
                count = 1;
            }
        }
        sb.append(currentChar).append(count);

        return sb.toString();
    }
}
