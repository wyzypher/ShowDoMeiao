package showdomeiao;
public class JogoQuizApp implements JogoQuiz {
    private Facil facil = new Facil();
    private Medio medio = new Medio();
    private Dificil dificil = new Dificil();

    @Override
    public void perguntasFacil() {
        facil.perguntasFacil();
    }

    @Override
    public void perguntasMedio() {
        medio.perguntasMedio();
    }

    @Override
    public void perguntasDificil() {
        dificil.perguntasDificil();
    }

    @Override
    public void todasAsPerguntas() {
        perguntasFacil();
        perguntasMedio();
        perguntasDificil();
    }

    public void exibirPontuacao() {
        int totalScore = facil.getScore() + medio.getScore() + dificil.getScore();
        System.out.println("Você acertou um total de " + totalScore + " perguntas.");
    }
}