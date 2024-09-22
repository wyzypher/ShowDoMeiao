package showdomeiao;
import java.util.Scanner;
class Dificil implements JogoQuiz {
    private int score = 0;

    @Override
    public void perguntasFacil() { }

    @Override
    public void perguntasMedio() { }

    @Override
    public void perguntasDificil() {
        Scanner ler = new Scanner(System.in);
        String[] perguntas = {
            "Qual é a fórmula química da água?\n1. CO2\n2. H2O\n3. NaCl",
            "Qual é o maior planeta do sistema solar?\n1. Terra\n2. Júpiter\n3. Marte",
            "Qual é o órgão mais pesado do corpo humano?\n1. Fígado\n2. Cérebro\n3. Pulmão",
            "Qual é a unidade usada para medir a frequência?\n1. Hertz\n2. Pascal\n3. Joule",
            "Qual é a língua mais falada no mundo?\n1. Espanhol\n2. Chinês Mandarim\n3. Inglês",
            "Quem desenvolveu a teoria da relatividade?\n1. Isaac Newton\n2. Galileo Galilei\n3. Albert Einstein",
            "Qual é a distância da Terra ao Sol?\n1. 150 milhões de km\n2. 200 milhões de km\n3. 250 milhões de km",
            "Em que ano ocorreu a queda do Muro de Berlim?\n1. 1985\n2. 1989\n3. 1991",
            "Qual é o país de origem do café?\n1. Colômbia\n2. Brasil\n3. Etiópia",
            "Qual é a capital da Austrália?\n1. Sydney\n2. Melbourne\n3. Canberra"};
        int[] respostasCorretas = {2, 2, 1, 1, 2, 3, 1, 2, 3, 3};

        for (int i = 0; i < perguntas.length; i++) {
            System.out.println(perguntas[i]);
            int resposta = ler.nextInt();
            if (resposta == respostasCorretas[i]) {
                score++;
            }
        }
    }

    @Override
    public void todasAsPerguntas() { }

    public int getScore() {
        return score;
    }
}