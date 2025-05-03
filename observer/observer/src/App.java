import Entidades.*;
import AntiPatters.*;
import Patters.*;

public class App {
    public static void main(String[] args) throws Exception {

        VietnaAcoplado vietnaAcoplado = new VietnaAcoplado(new ForrestGump(), new Bubba());
        vietnaAcoplado.detectarVietcongue();

        VietnaDesacoplado vietnaDesacoplado = new VietnaDesacoplado(new ForrestGump(), new Bubba());
    }
}
