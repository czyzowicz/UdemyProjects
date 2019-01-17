package JavaMasterClass;

public class Methods {
    public static void main(String[] args) {
    int highScore = calcutaleScore(true,800, 5,100);
        System.out.println("Your final score was " + highScore);

    highScore = calcutaleScore(true,10000, 8,200);
        System.out.println("Your final score was " + highScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("mike", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("ted", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("lucas", highScorePosition);
    }

    public static int calcutaleScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score +(levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        else {
            return -1;
        }
    }

    public static void displayHighScorePosition (String playerName, int highScorePosition ){
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score table.");
    }

    public static int calculateHighScorePosition (int playerScore) {
    if (playerScore >= 1000){
    return 1;
    }
    else if (playerScore >= 500) {
        return 2;
    }
    else if (playerScore >= 100) {
        return 3;
    }
    else
        return 4;
    }
}
