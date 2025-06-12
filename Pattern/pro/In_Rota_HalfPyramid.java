public class In_Rota_HalfPyramid{
    public static void Inverted_Rotated_HalfPyramid(int totalRows){
        for(int i = 1; i <= totalRows; i++){
            for(int j = totalRows-i; j >= 0; j--){
                System.out.print(" ");
                
            }
            for(int k = 1 ; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Inverted_Rotated_HalfPyramid(10);
    }
    
}