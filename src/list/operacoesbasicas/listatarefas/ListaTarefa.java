package list.operacoesbasicas.listatarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void add(String descricao) {
        this.tarefaList.add(new Tarefa(descricao));
    }

    public void remove(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        for (Tarefa t : this.tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }

        this.tarefaList.removeAll(tarefasParaRemover);

    }

    public int allNumberTarefas() {
        return this.tarefaList.size();
    }

    public void getAllDescriptionTarefas() {
        System.out.println(this.tarefaList);
    }


    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.add("Lógica Programação");

     listaTarefa.getAllDescriptionTarefas();

     listaTarefa.remove("Lógica Programação");
        listaTarefa.getAllDescriptionTarefas();
    }
}

