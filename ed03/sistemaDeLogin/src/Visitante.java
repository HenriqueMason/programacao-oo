class Visitante extends Usuario {
    /**
     * Criando a classe Visitante estendendo da classe pai usuario
     * @param login
     * @param senha
     */

    public Visitante(String login, String senha) {
        super(login, senha);
    }

    @Override
    public void exibirLogin() {
        System.out.println("Visitante - acesso restrito ao sistema.");
    }
}
