public class GraficoEstatistico implements Imprimivel {
    /**
     * Criando a classe graficoestatistico e implementando o arquivo imprimivel
     */
    private String titulo;
    private String tipoGrafico;

    public GraficoEstatistico(String titulo, String tipoGrafico) {
        this.titulo = titulo;
        this.tipoGrafico = tipoGrafico;
    }

    @Override
    public void imprimir() {
        System.out.println("Gráfico: " + tipoGrafico);
        System.out.println("Título: " + titulo.toUpperCase());
    }
}
