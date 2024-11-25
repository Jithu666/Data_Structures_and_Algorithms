public class palindrome {

    public static void main(String[] args) {

        String name = "madam3";
        Palindrome(name);
    }

    public static void Palindrome(String name) {

        String reversed = new StringBuilder(name).reverse().toString();

        if(name.equals(reversed)){
            System.out.println(name + " is Palindrome");
        }
        else{
            System.out.println(name + " is not palindrome");
        }
    }

}
