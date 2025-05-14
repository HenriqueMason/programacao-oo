public class Guerreiro extends Personagem {
    /**
     * Criando a classe Guerreiro estendendo da classe Personagem
     */
    public Guerreiro(String nome) {
        super(nome, 150, 25);
    }

    /**
     * Criando os atributos do Guerreiro
     * @param inimigo
     */
    @Override
    public void atacar(Personagem inimigo) {
        System.out.println("-" + nome + " ataca com espada!");
        inimigo.defender(ataqueBase);
    }

    @Override
    public void defender(int dano) {
        int danoReduzido = dano / 2;
        super.defender(danoReduzido);
        System.out.println("-" + nome + " usou defesa de guerreiro (dano reduzido pela metade)!");
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println("-" + nome + " usa Golpe Duplo!");
        ataqueBase *= 2;
        System.out.println("Dano dobrado para o próximo ataque.");
    }
}

