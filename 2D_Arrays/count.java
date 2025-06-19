public class count {
    public static void main(String[] args) {
        int[][] array = {{4,7,8,7,7,7,7,7,},{8,8,7}};
        int count = 0;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if(array[i][j]==7){
                    count++;
                }
            }
        }

        System.out.println("count of 7 is:"+count);
    }
}
