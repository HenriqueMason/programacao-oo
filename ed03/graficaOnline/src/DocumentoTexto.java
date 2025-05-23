public class DocumentoTexto implements Imprimivel {
    /**
     * Criando a classe documentotexto e implementando o arquivo imprimivel
     */
    private String titulo;
    private String conteudo;

    public DocumentoTexto(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    @Override
    public void imprimir() {
        System.out.println(titulo.toUpperCase());
        System.out.println(conteudo);
    }
}


