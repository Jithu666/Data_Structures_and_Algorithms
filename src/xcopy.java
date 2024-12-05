public class xcopy {
    public static void main(String[] args) {
        int orig = 42;
        xcopy x = new xcopy();
        int y = x.go(orig);
        System.out.println(orig + " " + y);
    }

    public int go(int parameter) {
        return 2 * parameter;
    }
}
