package modules;

/**
 * Created by Kocherga Vitalii on 12.04.2016.
 */

public class View {

    /**
     * @param inputMessage
     */
    void printMessage(String inputMessage) {
        System.out.print(inputMessage);
    }

    /**
     *
     * @param message
     */
    void printMessage(Message message) {
        System.out.print(message.getText());
    }

    /**
     *
     * @param message
     * @return
     */
    String getMessage(Message message) {
        return message.getText();
    }

}
