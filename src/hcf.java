public class hcf {
    public static void main(String[] args) {
        int n1 = 15;
        int n2 = 70;

        int res = hcf(n1, n2);
        System.out.println(res);
    }
    public static int hcf(int n1, int n2){

        if(n2 > n1){
            int temp = n2;
            n2 = n1;
            n1 = temp;
        }

        // without using recursion.
        while(n2 != 0){
            int remainder = n1 % n2;
            n1 = n2;
            n2 = remainder;
        }

        // using recursion.
//        if(n2 == 0){
//            return n1;
//        }
//        return hcf(n2, n1 % n2);
        return n1;
    }

}
