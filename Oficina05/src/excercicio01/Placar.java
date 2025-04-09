package excercicio01;

import java.util.ArrayList;

public class Placar {

    private ArrayList<Jogador> ranking;

    public Placar(){
        this.ranking = new ArrayList<>();
    }

    public void adicionarJogador(Jogador j){
        ranking.add(j);
    }

    public void mostrarRanking(){
        for(Jogador jogador : ranking){
            System.out.println(jogador);
        }
    }
}
