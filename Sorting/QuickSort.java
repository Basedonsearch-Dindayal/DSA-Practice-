public class QuickSort {
    public static void main(String[] args) {
    int []arr = {9,5,6,2,4,7,1,3};
        quickShot(arr, 0, arr.length-1);
        printArr(arr);
    }
    public static void quickShot(int [] arr,int si,int ei) {
        if (si >= ei) {
            return;
        }
        int pidx = partion(arr,si,ei);
        quickShot(arr, si, pidx-1);        
        quickShot(arr,pidx+1,ei);        
    }
    public static int partion(int[] arr,int si,int ei) {
        int pivot = arr[ei];
        int i = si-1;

        for (int j = si; j < ei; j++) {
        if (arr[j] <= pivot) {
            i++;
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
    }

        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void printArr(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}