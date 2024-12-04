public class stringConversion {
    public static void main(String[] args) {
        String name = "103"; // Expected output: JITHU

        char[] arr = name.toCharArray();
        String curr = "";
        String res = "";

        for (int i = arr.length - 1; i >= 0; i--) {
            curr = "";

            // Ensure that we do not go out of bounds
            if (i - 1 >= 0) {
                curr = "" + arr[i - 1] + arr[i];
                int n = Integer.parseInt(curr);

                if (n == 32) {
                    res = " " + res;
                    i--; // Skip the next character since we've already processed it
                } else if ((n >= 65 && n <= 90) || (n >= 97 && n <= 122)) {
                    res = (char) n + res;
                    i--; // Skip the next character since we've already processed it
                } else {
                    if (i - 2 >= 0) {
                        curr = arr[i - 2] + curr;
                        n = Integer.parseInt(curr);
                        res = (char) n + res;
                        i -= 2; // Skip the next two characters since we've already processed them
                    }
                }
            }
        }
        System.out.println(res);
    }
}
