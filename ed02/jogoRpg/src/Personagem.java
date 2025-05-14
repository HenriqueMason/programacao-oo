public abstract class Personagem {
    /**
     * Criando a classe Personagem
     */
    protected String nome;
    protected int hp;
    protected int ataqueBase;

    /**
     * Criando os atributos de cada personagem
     * @param nome
     * @param hp
     * @param ataqueBase
     */
    public Personagem(String nome, int hp, int ataqueBase) {
        this.nome = nome;
        this.hp = hp;
        this.ataqueBase = ataqueBase;
    }

    public abstract void atacar(Personagem inimigo);

    public abstract void usarHabilidadeEspecial();

    public void defender(int dano) {
        this.hp -= dano;
        if (this.hp < 0) this.hp = 0;
        System.out.println("-" + nome + " recebeu " + dano + " de dano!");
    }

    public void status() {
        System.out.println("[" + nome + "] HP: " + hp + " | Ataque Base: " + ataqueBase);
    }

    public boolean estaVivo() {
        return hp > 0;
    }
}


