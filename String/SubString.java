import java.util.Scanner;
public class SubString {
    public static void main(String args[]){
        String str = "HelloWorld";
        Scanner Sc = new Scanner(System.in); 
        System.out.print("Enter starting index:");
        int si = Sc.nextInt();
        System.out.print("Enter ending index:");
        int ei = Sc.nextInt();
        sub_string(str, si, ei);
        Sc.close();
    }
    public static void sub_string(String str,int si,int ei){
        // if(si <= 0 & ei > str.length()-1 ){
        //     System.out.println("Index are not valid please enter valid index");
        // }
        // else{
        //     for(int i = si ; i < ei ; i++){
        //         System.out.print(str.charAt(i)+" ");
        //     }
        // }
        System.out.println(str.substring(si,ei));
    }
}
