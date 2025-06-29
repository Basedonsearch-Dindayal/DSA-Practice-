public class OccurringIndex {
    public static void main(String[] args) {
        int key = 2;
        int arr[] = {3,2,4,5,6,2,7,2,2};
        int n = 0;
        PrintOccurrence(key,arr,n);
    }
    public static void PrintOccurrence(int key, int arr[],int n) {
        if(n == arr.length){
            return;
        }
        if(key == arr[n]){
            System.out.println(n+" ");
        }
        PrintOccurrence(key,arr,n+1);
    }
}
