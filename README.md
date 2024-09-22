# Jogo de Quiz em Java

## Descrição
Este projeto é um jogo de quiz desenvolvido em Java, como parte de um trabalho para faculdade. O jogo permite que os jogadores testem seus conhecimentos em diferentes níveis de dificuldade: fácil, médio e difícil. O jogo também oferece a opção de jogar com todas as perguntas juntas, proporcionando uma experiência dinâmica e divertida.

## Funcionalidades
- **Níveis de Dificuldade**: Escolha entre três níveis de dificuldade:
  - Fácil
  - Médio
  - Difícil
- **Modo de Jogo Completo**: Jogue com todas as perguntas disponíveis.
- **Pontuação**: O jogador recebe uma pontuação com base nas respostas corretas.
- **Repetição**: O jogador pode escolher jogar novamente ou sair após cada partida.

## Tecnologias Utilizadas
- Java
- Scanner (para entrada de dados)

## Instruções de Jogo
Ao iniciar, escolha um nível de dificuldade ou jogue com todas as perguntas.
Responda às perguntas e veja sua pontuação ao final.
Decida se deseja jogar novamente ou sair do jogo.

## Contribuições
Sinta-se à vontade para contribuir com melhorias, correções ou novas perguntas!
## UML


```mermaid
classDiagram
    JogoQuiz <|.. Facil
    JogoQuiz <|.. Medio
    JogoQuiz <|.. Dificil
    JogoQuizApp --> Facil
    JogoQuizApp --> Medio
    JogoQuizApp --> Dificil

    class JogoQuiz {
        +perguntasFacil() void
        +perguntasMedio() void
        +perguntasDificil() void
        +todasAsPerguntas() void
    }

    class Facil {
        -score: int
        +perguntasFacil() void
        +perguntasMedio() void
        +perguntasDificil() void
        +todasAsPerguntas() void
        +getScore() int
    }

    class Medio {
        -score: int
        +perguntasFacil() void
        +perguntasMedio() void
        +perguntasDificil() void
        +todasAsPerguntas() void
        +getScore() int
    }

    class Dificil {
        -score: int
        +perguntasFacil() void
        +perguntasMedio() void
        +perguntasDificil() void
        +todasAsPerguntas() void
        +getScore() int
    }

    class JogoQuizApp {
        -facil: Facil
        -medio: Medio
        -dificil: Dificil
        +perguntasFacil() void
        +perguntasMedio() void
        +perguntasDificil() void
        +todasAsPerguntas() void
        +exibirPontuacao() void
    }
