public class Triangle_01{
    public static void Print01Triangle (int totalRows) {
        for(int i = 1; i <= totalRows; i++){
            for(int j = 1 ; j <= i; j++){
                if((i+j) % 2 == 0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Print01Triangle(10);
    }
}