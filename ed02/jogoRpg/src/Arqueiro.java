import java.util.Random;

public class Arqueiro extends Personagem {
    private Random random = new Random();
    /**
     * Criando a classe Arqueiro estendendo da classe Personagem
     */
    public Arqueiro(String nome) {
        super(nome, 100, 20);
    }

    /**
     * Criando os atributos do Arqueiro
     * @param inimigo
     */
    @Override
    public void atacar(Personagem inimigo) {
        boolean critico = random.nextDouble() < 0.25;
        int dano = critico ? ataqueBase * 2 : ataqueBase;
        System.out.println("-" + nome + (critico ? " acerta um CRÍTICO!" : " ataca com flecha."));
        inimigo.defender(dano);
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println("-" + nome + " usa Chuva de Flechas!");
        for (int i = 1; i <= 3; i++) {
            System.out.println("-Flecha " + i + " disparada!");
            // Simula múltiplos ataques — aqui precisaria de um alvo real para cada
        }
    }
}

