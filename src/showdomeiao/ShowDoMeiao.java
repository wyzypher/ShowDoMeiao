package showdomeiao;
import java.util.Scanner;

public class ShowDoMeiao {
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
        JogoQuizApp jogo = new JogoQuizApp();
        
        boolean continuar = true;
        
        while (continuar) {
        // Menu de escolha de dificuldade
        System.out.println("Escolha o nível de dificuldade:");
        System.out.println("1. Fácil");
        System.out.println("2. Médio");
        System.out.println("3. Difícil");
        System.out.println("4. Todas as perguntas");
        int escolha = ler.nextInt();

        switch (escolha) {
            case 1:
                jogo.perguntasFacil();
                break;
            case 2:
                jogo.perguntasMedio();
                break;
            case 3:
                jogo.perguntasDificil();
                break;
            case 4:
                jogo.todasAsPerguntas();
                break;
            default:
                System.out.println("Escolha inválida.");
                return;
        }
        // Exibe a pontuação final
        jogo.exibirPontuacao();
        if (continuar) {
                System.out.println("\nDeseja jogar novamente? (S/N)");
                String jogarNovamente = ler.next();
                if (jogarNovamente.equalsIgnoreCase("N")) {
                    continuar = false;
                    System.out.println("Saindo do jogo. Obrigado por jogar!");
                }
        }
        }
    }
}