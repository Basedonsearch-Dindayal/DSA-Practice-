public class SolidRhombus{
    public static void PrintSolidRhombus(int totalRows){
        for(int i = 1; i <= totalRows; i++){
            for(int j = (totalRows+1)-i; j >= 0; j-- ){
                System.out.print(" ");
            }
            for(int k = 1; k <= totalRows; k++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        PrintSolidRhombus(5);
    }
}