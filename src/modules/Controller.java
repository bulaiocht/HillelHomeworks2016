package modules;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by Kocherga Vitalii on 12.04.2016.
 */

public class Controller {

    /**
     * this regex checking the Username,
     * allowing it to contain not more than 16 latin letters
     */
    private final String LOGIN_REGEX = "[a-zA-Z]{1,16}";

    private String username;
    private Model model;
    private View view;
    private StringBuffer userInputLog = new StringBuffer();


    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    /**
     * This method is creating the game
     */
    public void play() {

        //Checking username
        checkUsername(model);

        //Checking input data
        checkingInputData(model);

    }

    /**
     *
     */
    private void checkUsername(Model model) {
        Scanner scanner = new Scanner(System.in);

        view.printMessage(Message.NAME);

        while (!Pattern.matches(LOGIN_REGEX, username = scanner.next())) {
            view.printMessage(Message.ERR_NAME);
            view.printMessage(Message.NAME);
        }
        userInputLog.append(">>" + view.getMessage(Message.YOUR_NAME)).append(username + "\n").append(">>");
        view.printMessage(Message.GUESS_NUMBER);
        view.printMessage(Message.BOUNDS);
        view.printMessage(model.getLowBound() + " and " + model.getTopBound() + "\n");
    }

    /**
     * @param model
     */
    private void checkingInputData(Model model) {

        while (true) {
            int in;
            Scanner sc = new Scanner(System.in);
            try {
                in = sc.nextInt();
                //checking if user input number is inside the bounds
                if (in > model.getTopBound() || in < model.getLowBound()) {
                    view.printMessage(Message.ERR_BOUND);
                    view.printMessage(Message.BOUNDS);
                    view.printMessage(model.getLowBound() + " and " + model.getTopBound() + "\n");
                }
                //actions if user didn't guess the number correctly
                else if (!model.setInputNumber(in)) {
                    view.printMessage(Message.RETRY);
                    view.printMessage(Message.BOUNDS);
                    view.printMessage(model.getLowBound() + " and " + model.getTopBound() + "\n");
                    userInputLog.append(in + ",");
                }
                //user guessed the number correctly
                else {
                    userInputLog.append(in + ".");
                    view.printMessage(Message.WIN);
                    view.printMessage(Message.SEC_NUM.getText() + model.getSecretNumber() + "\n");
                    view.printMessage(Message.YOUR_INPUT.getText() + "\n");
                    view.printMessage(userInputLog.toString());
                    return;
                }
            } catch (Exception ex) {
                view.printMessage(Message.ERR_INPUT);
                view.printMessage(Message.RETRY);
            }
        }
    }
}
