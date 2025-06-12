public class FloydTriangle{
    public static void Floyd_Triangle(int totalRows) {
        int lastNum = 1;
        for(int i = 1; i <= totalRows; i++){
            for(int j = 1 ; j <= i; j++){
                System.out.print(lastNum +" ");
                lastNum++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Floyd_Triangle(5);
    }
}