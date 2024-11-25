import java.util.*;

//public class sink_A_Startup {

//    public static void main(String[] args) {
//
//        int no_Of_Guesses = 0;
//        GameHelper helper = new GameHelper();
//        StartupBust game = new StartupBust();
//
//        int random = (int) (Math.random() * 6);
//        int[] locations = {random, random+1, random+2};
//        ss.setLocationCells(locations);
//
//        boolean isAlive = true;
//
//        String result = "";
//        while (isAlive) {
//
//            int guess = helper.getUserInput("Enter a Number ");
//            result = ss.checkYourself(guess);
//            no_Of_Guesses++;
//
//            if(result.equals("Kill")) {
//                isAlive = false;
//                System.out.println("You took " + no_Of_Guesses + " guesses");
//            }
//        }

//        String testResult = "Passed";
//        if(!result.equals("Hit")) {
//            System.out.println("Passed");
//        } else
//            System.out.println(testResult);
//    }
//}

public class StartupBust {

    private GameHelper helper = new GameHelper();
    private ArrayList<Startup> startups = new ArrayList<Startup>();
    private int numOfGuesses = 0;

//    public void setLocationCells(ArrayList<String> locs) {
//        this.locationCells = locs;
//    }

    private void setUpGame() {
        // first make some startups amd give them locations.
        Startup one = new Startup();
        one.setName("Poinez");
        Startup two = new Startup();
        two.setName("hacqi");
        Startup three = new Startup();
        three.setName("cabista");
        startups.add(one);
        startups.add(two);
        startups.add(three);

        System.out.println("Your goal is to sink three startup's.");
        System.out.println("Poinez, hacqi, cabista");
        System.out.println("Try to sink all in the fewest number of guesses.");

        for (Startup startup : startups) {
            ArrayList<String> newLocation = helper.placeStartup(3);
            startup.setLocationCells(newLocation);
        }
    }

    private void startPlaying() {
        while (!startups.isEmpty()) {
            String userGuess = String.valueOf(helper.getUserInput("Enter a guess"));
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "miss";

        for (Startup startupToTest : startups) {
            result = startupToTest.checkYourself(userGuess);

            if (result.equals("hit"))
                break;
            if (result.equals("kill")) {
                startups.remove(startupToTest);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame() {
        System.out.println("You Sunk all Startups");
        if (numOfGuesses <= 18) {
            System.out.println("It only took you " + numOfGuesses + " guesses");
        } else {
            System.out.println("Took you long enough. " + numOfGuesses + " guesses.");
        }
    }

    public static void main(String[] args) {
        StartupBust game = new StartupBust();
        game.setUpGame();
        game.startPlaying();
    }

}

//class GameHelper {
//
//    private static final String ALPHABET = "abcdefg";
//    private static final int GRID_LENGTH = 7;
//    private static final int GRID_SIZE = 49;
//    private static final int MAX_ATTEMPTS = 200;
//    static final int HORIZONTAL_INCREMENT = 1;
//    static final int VERTICAL_INCREMENT = GRID_LENGTH;
//
//    private final int[] grid = new int[GRID_SIZE];
//    private final Random random = new Random();
//    private int startupCount = 0;
//
//    public String getUserInput(String prompt) {
//        System.out.print(prompt + ": ");
//        Scanner sc = new Scanner(System.in);
//        return sc.nextLine().toLowerCase();
//    }
//
//    public ArrayList<String> placeStartup(int startupSize) {
//        // holds value form 0 - 48
//        int[] startupCoords = new int[startupSize];
//        int attempts = 0;
//        boolean success = false;
//
//        startupCount++;
//        int increment = getIncrement();
//
//        while(!success & attempts++ < MAX_ATTEMPTS) {
//            int location = random.nextInt(GRID_SIZE);
//
//            for (int i = 0; i < startupCoords.length; i++) {
//                startupCoords[i] = location;
//                location += increment;
//            }
//
//            if(startupFits(startupCoords, increment)) {
//                success = coordsAvailable(startupCoords);
//            }
//        }
//
//        savaPositionToGrid(startupCoords);
//        ArrayList<String> alphacells = convertCordeToAlphaFormat(startupCoords);
////        System.out.println("Placed at: " + alphacells);
//        return alphacells;
//    }
//
//
//    private boolean startupFits(int[] startupCoords, int increment) {
//        int finalLocation = startupCoords[startupCoords.length - 1];
//        if(increment == HORIZONTAL_INCREMENT) {
//            return calcRowFromIndex(startupCoords[0]) == calcRowFromIndex(finalLocation);
//        } else {
//            return finalLocation < GRID_SIZE;
//        }
//    }
//
//
//    private boolean coordsAvailable(int[] startupCoords) {
//        for(int coord : startupCoords) {
//            if(grid[coord] != 0) {
//                System.out.println("Position: " + coord + " already taken");
//                return false;
//            }
//        }
//        return true;
//    }
//
//
//    private void savaPositionToGrid(int[] startupCoords) {
//        for(int index : startupCoords) {
//            grid[index] = 1;
//        }
//    }
//
//    private ArrayList<String> convertCordeToAlphaFormat(int[] startupCoords) {
//        ArrayList<String> alphaCells = new ArrayList<String>();
//        for(int index : startupCoords) {
//            String alphaCoords = getAlphaCoordsFromIndex(index);
//            alphaCells.add(alphaCoords);
//        }
//        return alphaCells;
//    }
//
//
//    private String getAlphaCoordsFromIndex(int index) {
//        int row = calcRowFromIndex(index);
//        int column = index % GRID_LENGTH;
//        String letter = ALPHABET.substring(column, column+1);
//        return letter+row;
//    }
//
//
//    private int calcRowFromIndex(int index) {
//        return index;
//    }
//
//
//    private int getIncrement() {
//        if(startupCount % 2 == 0) {
//            return HORIZONTAL_INCREMENT;
//        } else {
//            return VERTICAL_INCREMENT;
//        }
//    }
//}


class GameHelper {
    private static final String ALPHABET = "abcdefg";
    private static final int GRID_LENGTH = 7;
    private static final int GRID_SIZE = 49;
    private static final int MAX_ATTEMPTS = 200;

    static final int HORIZONTAL_INCREMENT = 1;          // A better way to represent these two
    static final int VERTICAL_INCREMENT = GRID_LENGTH;  // things is an enum (see Appendix B)

    private final int[] grid = new int[GRID_SIZE];
    private final Random random = new Random();

    private int startupCount = 0;

    public String getUserInput(String prompt) {
        System.out.print(prompt + ": ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().toLowerCase();
    } //end getUserInput

    public ArrayList<String> placeStartup(int startupSize) {
        // holds index to grid (0 - 48)
        int[] startupCoords = new int[startupSize];         // current candidate co-ordinates
        int attempts = 0;                                   // current attempts counter
        boolean success = false;                            // flag = found a good location?

        startupCount++;                                     // nth Startup to place
        int increment = getIncrement();                     // alternate vert & horiz alignment

        while (!success & attempts++ < MAX_ATTEMPTS) {      // main search loop
            int location = random.nextInt(GRID_SIZE);         // get random starting point

            for (int i = 0; i < startupCoords.length; i++) {  // create array of proposed coords
                startupCoords[i] = location;                    // put current location in array
                location += increment;                          // calculate the next location
            }
            System.out.println("Trying: " + Arrays.toString(startupCoords));

            if (startupFits(startupCoords, increment)) {      // startup fits on the grid?
                success = coordsAvailable(startupCoords);       // ...and locations aren't taken?
            }                                                 // end loop
        }                                                   // end while

        savePositionToGrid(startupCoords);                  // coords passed checks, save
        ArrayList<String> alphaCells = convertCoordsToAlphaFormat(startupCoords);
        System.out.println("Placed at: "+ alphaCells);
        return alphaCells;
    } //end placeStartup

    boolean startupFits(int[] startupCoords, int increment) {
        int finalLocation = startupCoords[startupCoords.length - 1];
        if (increment == HORIZONTAL_INCREMENT) {
            // check end is on same row as start
            return calcRowFromIndex(startupCoords[0]) == calcRowFromIndex(finalLocation);
        } else {
            return finalLocation < GRID_SIZE;                 // check end isn't off the bottom
        }
    } //end startupFits

    boolean coordsAvailable(int[] startupCoords) {
        for (int coord : startupCoords) {                   // check all potential positions
            if (grid[coord] != 0) {                           // this position already taken
                System.out.println("position: " + coord + " already taken.");
                return false;                                   // NO success
            }
        }
        return true;                                        // there were no clashes, yay!
    } //end coordsAvailable

    void savePositionToGrid(int[] startupCoords) {
        for (int index : startupCoords) {
            grid[index] = 1;                                  // mark grid position as 'used'
        }
    } //end savePositionToGrid

    private ArrayList<String> convertCoordsToAlphaFormat(int[] startupCoords) {
        ArrayList<String> alphaCells = new ArrayList<String>();
        for (int index : startupCoords) {                   // for each grid coordinate
            String alphaCoords = getAlphaCoordsFromIndex(index); // turn it into an "a0" style
            alphaCells.add(alphaCoords);                      // add to a list
        }
        return alphaCells;                                  // return the "a0"-style coords
    } // end convertCoordsToAlphaFormat

    String getAlphaCoordsFromIndex(int index) {
        int row = calcRowFromIndex(index);                  // get row value
        int column = index % GRID_LENGTH;                   // get numeric column value

        String letter = ALPHABET.substring(column, column + 1); // convert to letter
        return letter + row;
    } // end getAlphaCoordsFromIndex

    private int calcRowFromIndex(int index) {
        return index / GRID_LENGTH;
    } // end calcRowFromIndex

    private int getIncrement() {
        if (startupCount % 2 == 0) {                        // if EVEN Startup
            return HORIZONTAL_INCREMENT;                      // place horizontally
        } else {                                            // else ODD
            return VERTICAL_INCREMENT;                        // place vertically
        }
    } //end getIncrement
} //end class



class Startup {
    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> loc){
        locationCells = loc;
    }

    public void setName(String n) {
        name = n;
    }

        public String checkYourself(String userInput) {
        String result = "miss";
        int index = locationCells.indexOf(userInput);

        if(index >= 0) {
            locationCells.remove(index);

            if(locationCells.isEmpty()) {
                result = "Kill";
                System.out.println("You sunk " + name + " :( ");
            } else {
                result = "Hit";
            }
        }
        return result;
    }
}

