package showdomeiao;
import java.util.Scanner;
class Medio implements JogoQuiz {
    private int score = 0;

    @Override
    public void perguntasFacil() { }

    @Override
    public void perguntasMedio() {
        Scanner ler = new Scanner(System.in);
        String[] perguntas = {
            "Quantos continentes existem?\n1. 5\n2. 6\n3. 7",
            "Quem descobriu o Brasil?\n1. Pedro Álvares Cabral\n2. Cristóvão Colombo\n3. Vasco da Gama",
            "Qual é o símbolo químico do oxigênio?\n1. O\n2. Ox\n3. Og",
            "Qual país tem a maior população do mundo?\n1. Índia\n2. China\n3. Estados Unidos",
            "Em que país estão localizadas as pirâmides de Gizé?\n1. México\n2. Egito\n3. Peru",
            "Quem é o autor do livro 'Dom Quixote'?\n1. William Shakespeare\n2. Miguel de Cervantes\n3. Gabriel García Márquez",
            "Qual é o país mais extenso do mundo?\n1. China\n2. Rússia\n3. Canadá",
            "Quantos segundos há em uma hora?\n1. 600\n2. 3600\n3. 7200",
            "Qual é a montanha mais alta do mundo?\n1. Monte Everest\n2. K2\n3. Kilimanjaro",
            "Qual é o maior deserto do mundo?\n1. Saara\n2. Deserto da Antártida\n3. Deserto de Gobi"};
        int[] respostasCorretas = {3, 1, 1, 2, 2, 2, 2, 2, 1, 2};

        for (int i = 0; i < perguntas.length; i++) {
            System.out.println(perguntas[i]);
            int resposta = ler.nextInt();
            if (resposta == respostasCorretas[i]) {
                score++;
            }
        }
    }

    @Override
    public void perguntasDificil() { }

    @Override
    public void todasAsPerguntas() { }

    public int getScore() {
        return score;
    }
}