package Patters;

public class ChocolateBox {
    private static ChocolateBox instancia;

    private ChocolateBox() {}

    public static ChocolateBox getInstance() {
        if (instancia == null) {
            instancia = new ChocolateBox();
        }
        return instancia;
    }

    public void abrir() {
        System.out.println("A vida é como uma caixa de chocolates voce nunca sabe o que vai encontrar");
    }
}
