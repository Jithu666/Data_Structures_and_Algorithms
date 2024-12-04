public class squaredNumberStar {
    public static void main(String[] args) {
        int n = 4;
        int d = 1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(j < n-1){
                    System.out.print(d + " * ");
                }else {
                    System.out.print(d);
                }
                d++;
            }
            System.out.println();
        }
    }
}
