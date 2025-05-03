package Entidades;

import java.util.ArrayList;
import java.util.List;

public class TarefaComposta implements Tarefa {
    private List<Tarefa> tarefas = new ArrayList<>();

    public void adicionar(Tarefa t) {
        tarefas.add(t);
    }

    public void executar() {
        for (Tarefa t : tarefas) {
            t.executar();
        }
    }
}
