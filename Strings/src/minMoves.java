public class minMoves {
    public static void main(String[] args) {
        String start = "Gethendra";
        String target = "Jithendra";


        int ans = minMoves(start, target);
        System.out.println(ans);
    }

    public static int minMoves(String start, String target){

        int moves = 0;
        for(int i = 0; i < start.length(); i++){
            if(start.charAt(i) != target.charAt(i))
                moves++;
            }
        return moves;
    }
}
