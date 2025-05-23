public class ProgramaImpressao {
    /**
     * Onde o programa vai rodas por conter o main
     * @param args
     */
    public static void main(String[] args) {
        DocumentoTexto doc = new DocumentoTexto("Relatório de Vendas", "Conteúdo detalhado das vendas do mês.");
        ImagemDigital img = new ImagemDigital("foto_paisagem.jpg", "1920x1080");
        GraficoEstatistico grafico = new GraficoEstatistico("Desempenho Anual", "barra");
        RelatorioPDF relatorio = new RelatorioPDF("João Silva", 45);

        doc.imprimir();
        System.out.println("----------");
        img.imprimir();
        System.out.println("----------");
        grafico.imprimir();
        System.out.println("----------");
        relatorio.imprimir();
    }
}

