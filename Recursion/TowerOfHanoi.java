public class TowerOfHanoi {
    public static void main(String[] args) {
        int n = 5;
        towerOfHanoi(n,"A","B","C");
    }
    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if(n == 1){
            System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
        towerOfHanoi(n-1, helper,src, dest);
    }
}
