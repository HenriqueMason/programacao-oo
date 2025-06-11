// ======= model/Contato.java =======
package model;

/** Interface que define o contrato público mínimo de um contato. */
public interface Contato {
    String getNome();
    void   setNome(String nome);

    String getTelefone();
    void   setTelefone(String telefone);

    String getEmail();
    void   setEmail(String email);

    /** CPF (11) ou CNPJ (14), dependendo do tipo concreto. */
    String getDocumento();
}
