import AntiPatters.*;
import Patters.*;

public class App {
    public static void main(String[] args) throws Exception {
        ChocolateBoxAnti caixa1 = new ChocolateBoxAnti();
        ChocolateBoxAnti caixa2 = new ChocolateBoxAnti();

        ChocolateBox caixa = ChocolateBox.getInstance();
        caixa.abrir();
    }
}
