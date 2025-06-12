public class LinearSearch{
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10,12,14,16};
        int key = 5;
        Linear_Search(number,key);
    }
    public static void Linear_Search(int number[],int key) {
        for(int i = 0; i < number.length; i++){
            if(number[i] == key){
                System.out.print("Key is present in the number array");
                return;
            }
        }System.out.print("Invalid key");
    }
}