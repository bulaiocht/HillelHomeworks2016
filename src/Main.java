import modules.*;

/**
 * Created by Kocherga Vitalii on 15.04.2016.
 */

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.play();
    }
}