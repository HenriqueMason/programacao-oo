// ======= model/PessoaJuridica.java =======
package model;

public class PessoaJuridica extends ContatoBase {
    private final String cnpj;

    public PessoaJuridica(String nome, String telefone, String email, String cnpj) {
        super(nome, telefone, email);
        if (!cnpjValido(cnpj))
            throw new IllegalArgumentException("CNPJ inválido.");
        this.cnpj = cnpj;
    }

    @Override public String getDocumento() { return cnpj; }
    @Override public String getTipo()      { return "PJ"; }

    private static boolean cnpjValido(String cnpj) {
        return cnpj != null && cnpj.matches("\\d{14}");
        // TODO algoritmo completo de verificação
    }
}

