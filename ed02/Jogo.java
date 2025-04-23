import java.util.Random;

public class Jogo {
    /**
     * Criando os atributos jogador do tipo jogador e numerosecreto do tipo inteiro
     */
    private Jogador jogador;
    private int numeroSecreto;

    /**
     * Iniciando as variaveis com seus valores
     * numero secreto ira receber um numero aleatorio entre 0 e 99, mas como não vamos usar o 0 adicionamos + 1.
     */
    public Jogo(Jogador jogador) {
        this.jogador = jogador;
        Random rand = new Random();
        this.numeroSecreto = rand.nextInt(100) + 1;
    }

    /**
     * Criação do laco de repetição para ver se o usuario acerto o numero secreto
     */
    public String jogar(int tentativa){
        jogador.incrementarTentativa();
        if(tentativa == numeroSecreto){
            int pontos = 100 - jogador.getTentativas() * 2;
            jogador.atualizarPontuacao(pontos);
            return "Acertou";
        } else if(tentativa > numeroSecreto){
            return "Numero muito alto";
        } else {
            return "Numero muito baixo";
        }
    }
}
