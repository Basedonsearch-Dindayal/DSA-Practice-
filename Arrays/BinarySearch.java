import java.util.*;

public class BinarySearch{
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10,12,14};
        int key = 12;

        System.out.println("index for key is: " + Binary_Search(number,key));
    }
    public static int Binary_Search(int number[], int key) {
        int start = 0;
        int end = number.length-1;
        while(start <= end){
            int mid = (start+end)/2;

            if(key == number[mid]){
                return mid;
            }
            if(key > number[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }return -1;
    }
}