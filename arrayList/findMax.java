import java.util.ArrayList;

public class findMax {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(8);
        list.add(9);
        list.add(1);
        list.add(8);

        int max = Integer.MIN_VALUE;
        for (int i = 0 ; i<list.size(); i++){
            if(list.get(i) > max){
                max = list.get(i);
            }
        }
        System.out.print("Max is : "+max);
    }
}