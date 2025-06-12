public class In_Num_HalfPyramid{
    public static void Inverted_HalfPyramid(int totalRows) {
        for(int i = 0; i <= totalRows; i++){
            for(int j = 1; j <= totalRows-i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Inverted_HalfPyramid(10);
    }
}