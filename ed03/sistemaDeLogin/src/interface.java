/**
 * Criando as interfaces Autenticavel, gerenciavel e logavel
 */

interface Autenticavel {
    boolean autenticar(String senha);
}

interface Gerenciavel {
    void alterarSenha(String novaSenha);
    void bloquearUsuario();
}

interface Logavel {
    void registrarLog(String operacao);
}
