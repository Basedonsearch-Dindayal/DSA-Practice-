public class MakePair{
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10};
        makePair(num);
    }
    public static void makePair(int num[]) {
        for(int i = 0; i < num.length-1; i++){
            for(int j = i+1; j < num.length; j++){
                System.out.print("(" + num[i] + "," + num[j] + ")"+ "  ");
            }
            System.out.println();
            System.out.println();
        }
    }
}