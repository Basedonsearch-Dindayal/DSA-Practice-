public class UpperToLower {
    public static void main(String[] args) {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            char lowerCaseChar = (char) (ch | (1 << 5));//space can also be use as 32 is its ASCLL which is 00010000
            System.out.println(lowerCaseChar +" "+ ch);
        }
    }
}
