package modules;

/**
 * Created by Kocherga Vitalii on 12.04.2016.
 */

public class View {

    void printMessage(String inputMessage) {
        System.out.print(inputMessage);
    }

    void printMessage(Message message) {
        System.out.print(message.getText());
    }

    String getMessage(Message message) {
        return message.getText();
    }

}
