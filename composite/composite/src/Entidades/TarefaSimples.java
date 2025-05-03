package Entidades;

public class TarefaSimples implements Tarefa {
    private String nome;

    public TarefaSimples(String nome) {
        this.nome = nome;
    }

    public void executar() {
        System.out.println("Executando: " + nome);
    }
}