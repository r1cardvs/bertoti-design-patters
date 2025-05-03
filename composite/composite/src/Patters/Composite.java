package Patters;

import Entidades.*;

public class Composite {
    public Composite(){
    TarefaComposta empresa = new TarefaComposta();
    TarefaSimples pescar = new TarefaSimples("Pescar camarão");
    TarefaSimples fritar = new TarefaSimples("Fritar camarão");
    TarefaSimples vender = new TarefaSimples("Vender camarão");
    
    empresa.adicionar(pescar);
    empresa.adicionar(fritar);
    empresa.adicionar(vender);
    empresa.executar();
    empresa.adicionar(pescar);
    }
}
