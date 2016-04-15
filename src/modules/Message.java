package modules;

/**
 * This enum class is designed to store text constants for View output
 * Created by Kocherga Vitalii on 15.04.2016.
 */

enum Message {

    NAME("Please, enter your name:\t"),
    ERR_NAME("Incorrect name\n"),
    ERR_INPUT("Incorrect input!\t"),
    ERR_BOUND("Your number is out of bounds\n"),
    YOUR_NAME("Player:\t"),
    BOUNDS("Your bounds are:\t"),
    GUESS_NUMBER("Try to guess random number\n"),
    RETRY("Please, try again\n"),
    WIN("YOU WIN!\n"),
    SEC_NUM("Secret number is: "),
    YOUR_INPUT("Log of your input: ");

    private String text;

    Message(String text) {
        this.text = text;
    }

    String getText() {
        return this.text;
    }
}