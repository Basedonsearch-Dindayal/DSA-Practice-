public class MaxSubArr{
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10};
        int maxVal = maxSubArray(num);
        System.out.println("The Max sum is: " + maxVal);
    }
    public static int maxSubArray(int num[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i = 0; i < num.length; i++){
            for(int j = i; j < num.length; j++){
                currSum = 0;
                for(int k = i; k <= j; k++){
                    currSum = currSum + num[k];//Sum of subarray 
                }
                System.out.print(currSum+" ");
                if(currSum>maxSum){
                    maxSum = currSum;
                }
            }
            System.out.println();
        }
        return maxSum;
    }
}