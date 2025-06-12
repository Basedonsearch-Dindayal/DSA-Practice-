public class Diamond {
    public static void main(String[] args) {
        int totalRows = 8;
        int half = totalRows / 2;

        // Upper half of the diamond
        for (int i = 0; i <= half - 1; i++) {
            for (int j = half - i; j >= 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half of the diamond
        for (int i = half - 1; i >= 0; i--) {
            for (int j = half - i; j >= 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
