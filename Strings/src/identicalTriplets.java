public class identicalTriplets {
    public static void main(String[] args) {
        String word = "aadfbbbcc";

        int res = identicalTriplets(word);
        System.out.println(res);
    }

    public static int identicalTriplets(String word){
        int count = 0;
        for(int i = 0; i < word.length()-2; i++){
            if(word.charAt(i) == word.charAt(i+1) && word.charAt(i+1) ==  word.charAt(i+2)){
                count++;
                i+=2;
            }
        }
        return count;
    }
}
