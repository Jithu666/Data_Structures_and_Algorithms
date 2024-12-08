public class PowerFunction {
    public static void main(String[] args) {
        int x = 2;
        int y = -3;

        System.out.println(x + " raised to the power of " + y + " = " + powerFunction(x, y));
    }
    static int powerFunction(int x, int y){

        if(y == 0)
            return 1;

        if(y > 0){
            return x * powerFunction(x, y - 1);
        }

        return 1 / powerFunction(x, -y);
    }
}
