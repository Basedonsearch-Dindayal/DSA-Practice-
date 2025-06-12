public class LargestNumber{
    public static void main(String[] args) {
        int number[] = {1,2,6,3,5};
        int larger = 0; // i can also use integer.MIN_VALUE which is -infinity,best use if negative number is present
        for (int i = 0; i < number.length; i++){
            if(larger < number[i]){
                larger = number[i];
            }
        }System.out.print("The largest number is: "+ larger);
    }
}