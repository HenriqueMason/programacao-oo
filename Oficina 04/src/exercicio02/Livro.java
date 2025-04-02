package exercicio02;

public class Livro {

    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(){
        this.titulo = "";
        this.autor = "";
        this.anoPublicacao = 0;
    }

    public Livro(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public void exibir(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano publicação: " + anoPublicacao);
    }
}
