public class Mago extends Personagem {
    /**
     * Criando a classe Mago estendendo da classe Personagem
     */
    public Mago(String nome) {
        super(nome, 80, 30);
    }

    /**
     * Criando os atributos do Mago
     * @param inimigo
     */
    @Override
    public void atacar(Personagem inimigo) {
        System.out.println("-" + nome + " lança uma magia!");
        inimigo.defender(ataqueBase);
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println("-" + nome + " lança Bola de Fogo! (ataque em área)");
        // Aqui apenas simula — em jogo real, afetaria vários inimigos
    }
}

