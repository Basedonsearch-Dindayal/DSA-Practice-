import java.util.ArrayList;
public class Swap2Number {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);

        System.out.println("New list :"+ list);
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(8);
        list.add(9);
        list.add(1);
        list.add(8);

        int idx1 = 1;
        int idx2 = 3;
        System.out.println("old list :"+ list);
        swap(list,idx1,idx2);
    }
}
