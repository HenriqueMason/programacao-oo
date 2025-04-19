import java.util.Scanner; // Importando o scanner

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Placar placar = new Placar();

        boolean continuar = true;
        /**
         * variavel criada como boleano para implementar a repetição
         */
        while (continuar) {
            System.out.print("\nDigite o nome do jogador: ");
            String nome = teclado.nextLine();

            Jogador jogador = new Jogador(nome);
            Jogo jogo = new Jogo(jogador);

            boolean acertou = false;
            while (!acertou) {
                System.out.print("Digite um número entre 1 e 100: ");
                int tentativa = teclado.nextInt();
                teclado.nextLine();  // Limpa o buffer do scanner após usar nextInt()

                /**
                 * Chama o método jogar
                 */
                String resultado = jogo.jogar(tentativa);
                System.out.println(resultado);


                if (resultado.contains("Acertou")) {
                    acertou = true;
                }
            }

            /**
             * Adiciona o jogador no ranking
             */
            placar.adicionarJogador(jogador);

            /**
             * Usado para mostrar as tentativas e pontuação dos jogadores apos a jogada
             */
            System.out.println("Tentativas: " + jogador.getTentativas());
            System.out.println("Pontuação: " + jogador.getPontuacao());

            /**
             * Pergunta se irá jogar com outra pessoa, se sim ele encerra o laco principal e volta a perguntar o numero de 1 a 100
             */
            System.out.print("Deseja jogar com outra pessoa? (s/n): ");
            String resposta = teclado.nextLine();
            if (!resposta.equalsIgnoreCase("s")) {
                continuar = false;
            }
        }
        placar.mostrarRanking();
    }
}
