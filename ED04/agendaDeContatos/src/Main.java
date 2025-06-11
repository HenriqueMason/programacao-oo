import controller.ContatoController;
import view.ContatoView;

public class Main {
    public static void main(String[] args) {
        new ContatoView(new ContatoController()).iniciar();
    }
}