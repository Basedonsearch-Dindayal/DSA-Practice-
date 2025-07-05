public class ChangeArr{
    public static void main(String[] args) {
        int[] arr = new int[5];
        changeArr(arr, 0, 1);
        System.out.println();
        System.out.print("After -2 : ");
        PrintArr(arr);
    }
    public static void changeArr(int []arr,int i, int val) {
        //base case
        if(i == arr.length){
            System.out.print("NewArr : ");
            PrintArr(arr);
            return;
        }
        //kaam 
        arr[i] = val;
        changeArr(arr, i+1, val+1);
        arr[i] = arr[i] - 2;
    }
    public static void PrintArr(int []arr) {
        for(int x: arr){
            System.out.print(x + " ");
        }
    }
}