import java.util.Random;

class GuessingGame {
    private int targetNumber;
    private Player player1;
    private Player player2;
    private Player player3;

    public GuessingGame() {
        Random random = new Random();
        targetNumber = random.nextInt(10); // Generates a random number between 0 and 9
        player1 = new Player("Player 1");
        player2 = new Player("Player 2");
        player3 = new Player("Player 3");
    }

    public void startGame() {
        boolean isGuessed = false;

        while (!isGuessed) {
            int guess1 = player1.guess();
            int guess2 = player2.guess();
            int guess3 = player3.guess();

            System.out.println(player1.getName() + " guessed " + guess1);
            System.out.println(player2.getName() + " guessed " + guess2);
            System.out.println(player3.getName() + " guessed " + guess3);

            if (guess1 == targetNumber) {
                System.out.println(player1.getName() + " guessed the correct number!");
                isGuessed = true;
            }
            if (guess2 == targetNumber) {
                System.out.println(player2.getName() + " guessed the correct number!");
                isGuessed = true;
            }
            if (guess3 == targetNumber) {
                System.out.println(player3.getName() + " guessed the correct number!");
                isGuessed = true;
            }

            if (!isGuessed) {
                System.out.println("No correct guesses, trying again...\n");
            }
        }
    }

    public static void main(String[] args) {
        GuessingGame game = new GuessingGame();
        game.startGame();
    }
}

class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int guess() {
        Random random = new Random();
        return random.nextInt(10); // Generates a random guess between 0 and 9
    }
}
