package modules;

import java.util.Random;

/**
 * Created by Kocherga Vitalii on 12.04.2016.
 */

public class Model {

    /**
     *
     */
    private int inputNumber;

    /**
     *
     */
    private int secretNumber;

    /**
     *
     */
    private int lowBound = 0;

    /**
     *
     */
    private int topBound = 100;

    public Model() {
        Random random = new Random();
        this.secretNumber = random.nextInt(topBound) + lowBound;
    }

    int getInputNumber() {
        return inputNumber;
    }

    /**
     * Method consists main logic of a game.
     * @param userNumber player's input
     * @return true if user guessed number correctly
     * or false if user guessed it incorrectly
     */
    boolean setInputNumber(int userNumber) {
        if (userNumber == secretNumber) {
            inputNumber = userNumber;
            return true;
        } else if (userNumber > secretNumber) {
            topBound = userNumber;
            return false;
        }
        lowBound = userNumber;
        return false;

    }

    int getSecretNumber() {
        return secretNumber;
    }

    int getTopBound() {
        return topBound;
    }

    int getLowBound() {
        return lowBound;
    }


}
