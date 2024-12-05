public class MultiFor {
    public static void main(String[] args) {

        for(int i = 0; i < 4; i++){
            for(int j = 4; j > 2; j--) {
                if(i == 2){
                    i++;
                }
                System.out.println(i + " " + j);
            }
        }
    }
}
