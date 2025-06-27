public class CheckSortedArray{
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int i = 0;
        System.out.println(check(arr, i));
    }
    public static boolean check(int arr[],int i) {
        if (i == arr.length-1) {
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return check(arr, i+1);
    }
}