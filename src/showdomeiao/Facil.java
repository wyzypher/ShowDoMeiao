package showdomeiao;
import java.util.Scanner;
class Facil implements JogoQuiz {
    private int score = 0;

    @Override
    public void perguntasFacil() {
        Scanner ler = new Scanner(System.in);
        String[] perguntas = {
            "Qual é a capital do Brasil?\n1. São Paulo\n2. Rio de Janeiro\n3. Brasília",
            "Quantos dias tem uma semana?\n1. 5\n2. 7\n3. 10",
            "Quantos meses têm 30 dias?\n1. 11\n2. 4\n3. 6",
            "Qual é o nome do nosso planeta?\n1. Marte\n2. Terra\n3. Júpiter",
            "Qual é o nome do famoso rato da Disney?\n1. Mickey\n2. Donald\n3. Mouse",
            "Quantas cores tem o arco-íris?\n1. 5\n2. 7\n3. 9",
            "Qual é o maior animal terrestre?\n1. Elefante\n2. Girafa\n3. Leão",
            "Qual a cor do céu em um dia claro?\n1. Verde\n2. Azul\n3. Vermelho",
            "Quantos dedos uma pessoa normalmente tem nas mãos?\n1. 10\n2. 8\n3. 12",
            "Quantos olhos um ser humano tem?\n1. 1\n2. 2\n3. 3"};
        int[] respostasCorretas = {3, 2, 2, 2, 1, 2, 1, 2, 1, 2};

        for (int i = 0; i < perguntas.length; i++) {
            System.out.println(perguntas[i]);
            int resposta = ler.nextInt();
            if (resposta == respostasCorretas[i]) {
                score++;
            }
        }
    }

    @Override
    public void perguntasMedio() { }

    @Override
    public void perguntasDificil() { }

    @Override
    public void todasAsPerguntas() { }

    public int getScore() {
        return score;
    }
}