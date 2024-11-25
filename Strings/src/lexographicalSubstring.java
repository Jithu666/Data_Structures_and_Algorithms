public class lexographicalSubstring {
    public static void main(String[] args) {

        String name = "welcometojava";
        int k = 3;

        System.out.println(lexographicalSubstring(name, k));
    }

    public static String lexographicalSubstring(String name, int k){

        String smallest = name.substring(0, k);
        String largest = name.substring(0,k);

        for(int i = 1; i <= name.length() - k; i++){

            String substring = name.substring(i, i+k);

            if(substring.compareTo(smallest) < 0)
                smallest = substring;

            if(substring.compareTo(largest) > 0)
                largest = substring;
        }
        return smallest + "\n" + largest;
    }
}