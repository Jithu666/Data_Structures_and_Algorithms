public class exceptionHandling {
    public static void main(String[] args) {

        try {
            int[] numbers = {1,2,3};
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of Bounds");
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            System.out.println("Enter number in the given range");
        }
    }
}
