public class fizzBuzz {
    public static void main(String[] args) {
        int n = 16;
        fizzBuzz(n);
    }
    public static void fizzBuzz(int n) {

        for(int i = 1; i <= n; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0 && i % 5 != 0){
                System.out.println("Fizz");
//                i++;
            }
            else if(i % 5 == 0 && i % 3 != 0) {
                System.out.println("Buzz");
            }
            else if(i % 3 != 0 && i % 5!= 0){
                System.out.println(i);
            }
        }
    }

}
