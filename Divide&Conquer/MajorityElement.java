public class MajorityElement {
    public static void main(String[] args) {
    int []arr = {2,2,1,1,1,2,2};
        quickShot(arr, 0, arr.length-1);
        printArr(arr);
        majorityElement(arr);
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

    public static void majorityElement(int[] arr) {
    int majority = 0;
    int count = 0;
    int intial = arr[0];
    int num = intial; 

    for (int i = 0; i < arr.length; i++) {
        if (intial == arr[i]) {
            count++;
        } else {
            intial = arr[i];
            count = 1;
        }

        if (count > majority && count > arr.length/2) {
            majority = count;
            num = arr[i];
        }
    }
    System.err.println();
    System.out.println("MajorityElement is: " + num);    
    }
}