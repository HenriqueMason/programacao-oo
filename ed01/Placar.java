import java.util.ArrayList;

public class Placar {
    /**
     * Criando o atributo com o nome ranking do tipo array list
     */
    private ArrayList<Jogador> ranking;

    public Placar (){
        ranking = new ArrayList<>();
    }

    /**
     * Criando o metodo adicionar jogador para colocar ele no ranking
     * @param j
     */
    public void adicionarJogador(Jogador j){
        ranking.add(j);
    }

    /**
     * Laço de repetição para mostrar o ranking com todos os jogadores que jogaram
     */
    public void mostrarRanking(){
        System.out.println("Ranking: ");
        for(int i = 0; i < ranking.size(); i++){
            Jogador j = ranking.get(i);
            System.out.println(j.getNome() + ":" + " pontuação " + j.getPontuacao());
        }
    }
}
