public class ImagemDigital implements Imprimivel {
    /**
     * Criando a classe imagemdigital e implementando o arquivo imprimivel
     */
    private String nomeArquivo;
    private String resolucao;

    public ImagemDigital(String nomeArquivo, String resolucao) {
        this.nomeArquivo = nomeArquivo;
        this.resolucao = resolucao;
    }

    @Override
    public void imprimir() {
        System.out.println("Arquivo: " + nomeArquivo);
        System.out.println("Resolução: " + resolucao);
    }
}
