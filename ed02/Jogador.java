public class Jogador {
    /**
     * Criando os atributos nome, tentativas e pontuação, todos eles no modo privado
     */
    private String nome;
    private int tentativas;
    private int pontuacao;

    /**
     * Iniciando todas as variaveis/atributos criadas
     */
    public Jogador (String nome){
        this.nome = nome;
        this.tentativas = 0;
        this.pontuacao = 0;
    }

    /**
     * Criação do get nome, onde conseguiremos ler o valor da variavel mesmo sendo privado
     */
    public String getNome() {
        return nome;
    }
    /**
     * Criação do get tentativas, onde conseguiremos ler o valor da variavel mesmo sendo privado
     */
    public int getTentativas() {
        return tentativas;
    }
    /**
     * Criação do get pontuação, onde conseguiremos ler o valor da variavel mesmo sendo privado
     */
    public int getPontuacao() {
        return pontuacao;
    }
    /**
     * Criação do set nome, conseguimos alterar o valor da variavel sem precisar acessar diretamente
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * Criação do set tentativas, conseguimos alterar o valor da variavel sem precisar acessar diretamente
     */
    public void setTentativas(int tentativas) {
        this.tentativas = tentativas;
    }
    /**
     * Criação do set pontuacao, conseguimos alterar o valor da variavel sem precisar acessar diretamente
     */
    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }
    /**
     * Criação do metodo incrementar tentativas, onde tentativa irá receber ela mesmo mais 1
     */
    public void incrementarTentativa(){
        this.tentativas = tentativas + 1;
    }
    /**
     * Criação do metodo atualizar pontuação, onde ela vai receber a pontução mais o valor dado
     */
    public void atualizarPontuacao(int valor){
        this.pontuacao = this.pontuacao + valor;
    }
}
