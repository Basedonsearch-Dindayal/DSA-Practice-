public class CheckDuplicate {
    public static int containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return nums[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums));
    }
}
