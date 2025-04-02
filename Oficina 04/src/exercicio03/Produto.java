package exercicio03;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome){
        this.nome = nome;
        this.preco = 0;
        this.quantidade = 0;
    }

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void exibir(){
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
    }


}
