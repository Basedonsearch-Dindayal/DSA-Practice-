public class InversionCount {
    public static void main(String[] args) {
        int []arr = {2, 4, 1, 3, 5};
        System.out.println("Inversion Count is: "+inversionCount(arr));
    }
    public static int inversionCount(int []arr) {
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    count++;
                    System.out.println("("+arr[i]+","+arr[j]+")");
                }
            }
        }
        System.out.println();
        return count;
    }
}
