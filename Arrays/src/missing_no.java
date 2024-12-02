public class missing_no {
    public static void main(String[] args) {

        int a[] = {1,3,4,5,7,2};
        int n = a.length + 1;

        int sum = (n*(n+1))/2;

        int missingNumber = 0;

        for (int j : a) {
            sum -= j;
        }
        System.out.println("The missing Number is : " + sum);
    }
}