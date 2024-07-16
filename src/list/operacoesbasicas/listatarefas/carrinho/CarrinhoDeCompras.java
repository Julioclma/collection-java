package list.operacoesbasicas.listatarefas.carrinho;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    List<Item> carrinho;

    public CarrinhoDeCompras()
    {
        this.carrinho = new ArrayList<>();
    }

    //Adiciona um item ao carrinho com o nome, preço e quantidade especificados.
    public void adicionarItem(String nome, double preco, int quantidade){
        this.carrinho.add(new Item(nome, preco, quantidade));
    }
    //Remove um item do carrinho com base no seu nome.
    public void removerItem(String nome){
        List<Item> itemsParaRemover = new ArrayList<>();

        for (Item item : this.carrinho ) {
            if(item.getNome().equalsIgnoreCase(nome)){
                itemsParaRemover.add(item);
            }
        }

        this.carrinho.removeAll(itemsParaRemover);

    }
    //Calcula e retorna o valor total do carrinho, levando em consideração o preço e a quantidade de cada item.
    public double calcularValorTotal(){
        double total = 0;
        for ( Item item : this.carrinho) {
            total += item.getPreco() * item.getQuantidade();
        }
        return total;
    }

    //Exibe todos os itens presentes no carrinho, mostrando seus nomes, preços e quantidades.
    public void exibirItens(){
     System.out.println(this.carrinho);
    }


public static void main(String[] args) {
    CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
carrinhoDeCompras.exibirItens();

    //adicionando items ao carrinho
    carrinhoDeCompras.adicionarItem("Tablet", 299.99, 10);
    carrinhoDeCompras.adicionarItem("Iphone 13", 8299.99, 10);
    carrinhoDeCompras.exibirItens();

    //exibe total
    System.out.println("Valor total: "+ carrinhoDeCompras.calcularValorTotal());

    //removendo table e visualizando infos
    carrinhoDeCompras.removerItem("tablet");
    carrinhoDeCompras.exibirItens();
    System.out.println("Valor total: "+ carrinhoDeCompras.calcularValorTotal());


}

}
