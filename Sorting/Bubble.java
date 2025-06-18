import java.util.*;

public class Bubble {
    public static void main(String[] args) {
        int nums[] = {3,6,2,1,8,7,4,5,3,1};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void bubbleSort(int nums[]) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length - 1 - i; j++) {
                if(nums[j] < nums[j+1]) {  // Descending order
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
}
