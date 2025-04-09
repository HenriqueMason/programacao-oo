package excercicio01;

public class Jogador {

    private String nome;
    private int tentativas;
    private int pontuacao;

    public Jogador(String nome, int tentativas, int pontuacao){
        this.nome = nome;
        this.tentativas = tentativas;
        this.pontuacao = pontuacao;
    }

    public void incrementarTentativas(){
        this.tentativas = tentativas + 1;
    }

    public void atualizarPontuacao(int valor){
        valor = valor + pontuacao;
    }


    public String getNome(){
        return this.nome;
    }

    public int getTentativas(){
        return this.tentativas;
    }

    public int getPontuacao(){
        return this.pontuacao;
    }
}
