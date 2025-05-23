class Cliente extends Usuario implements Autenticavel {
    /**
     * Criando a classe Cliente estendendo da classe pai usuario
     * @param login
     * @param senha
     */
    public Cliente(String login, String senha) {
        super(login, senha);
    }

    @Override
    public boolean autenticar(String senha) {
        return senha.length() > 6 && this.senha.equals(senha);
    }
}
