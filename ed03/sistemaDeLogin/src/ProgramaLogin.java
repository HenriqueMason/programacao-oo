public class ProgramaLogin {
    /**
     * Onde o programa vai rodar, por conta do main
     * @param args
     */
    public static void main(String[] args) {
        Administrador admin = new Administrador("admin", "admin123");
        Visitante guest = new Visitante("guest", "qualquer");
        Cliente joao = new Cliente("joao", "segredo123");

        // Exibir login
        admin.exibirLogin();
        guest.exibirLogin();
        joao.exibirLogin();

        // Teste autenticação
        System.out.println("Admin autenticado (correta): " + admin.autenticar("admin123"));
        System.out.println("Admin autenticado (incorreta): " + admin.autenticar("errada"));

        System.out.println("João autenticado (correta): " + joao.autenticar("segredo123"));
        System.out.println("João autenticado (incorreta): " + joao.autenticar("123"));

        // Gerenciável e Logável
        admin.alterarSenha("novaSenha123");
        admin.bloquearUsuario();
        admin.registrarLog("Alteração de senha pelo admin.");
    }
}

