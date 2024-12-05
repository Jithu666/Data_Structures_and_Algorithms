public class playJVM {
    public static void main(String[] args) {

        playJVM pj = new playJVM();
        pj.go();
    }

    public void go() {
        int value = 7;
        for(int i = 1; i < 8; i++) {
            value++;

            if(i > 4){
                System.out.print(++value + " ");
            }

            if(value > 14){
                System.out.println("i = " + i);
                break;
            }
        }
    }
}
