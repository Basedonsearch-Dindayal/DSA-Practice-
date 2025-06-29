public class NumToStr {
    public static void main(String[] args) {
        int n = 2019;
        convert(n);
    }
    public static void convert(int n) {
        if(n == 0){
            return;
        }
        int num = n%10;
        if(num <= 4){
            if(num == 0){
                System.out.print("zero ");
            }
            else if(num == 1){
                System.out.print("one ");
            }
            else if(num == 2){
                System.out.print("two ");
            }
            else if(num == 3){
                System.out.print("three ");
            }
            else{
                System.out.print("four ");
            }
        }
        if(num > 4){
            if(num == 5){
                System.out.print("five ");
            }
            else if(num == 6){
                System.out.print("six ");
            }
            else if(num == 7){
                System.out.print("seven ");
            }
            else if(num == 8){
                System.out.print("eight ");
            }
            else if (num == 9){
                System.out.print("nine ");
            }
        }
        n = n/10;
        convert(n);
    }
}
