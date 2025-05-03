import AntiPatters.ForrestFugindo;
import AntiPatters.ForrestMaratona;
import Patters.CorridaFuga;
import Patters.CorridaMaratona;
import Patters.Forrest;

public class App {
    public static void main(String[] args) throws Exception {
        Forrest forrestStrategy = new Forrest(new CorridaMaratona());
        forrestStrategy.correr();
        forrestStrategy.setEstrategia(new CorridaFuga());
        forrestStrategy.correr();

        ForrestMaratona forrestMaratona = new ForrestMaratona();
        forrestMaratona.correr();

        ForrestFugindo forrestFugindo = new ForrestFugindo();
        forrestFugindo.correr();
    }
}
