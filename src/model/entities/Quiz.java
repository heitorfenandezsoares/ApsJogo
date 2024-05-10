package model.entities;

import java.util.Scanner;

public class Quiz {
    private String[] perguntas;
    private String[] respostas;
    private int pontuacao;

    public Quiz(String[] perguntas, String[] respostas) {
        this.perguntas = perguntas;
        this.respostas = respostas;
        this.pontuacao = 0;
    }

    public void jogar() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < perguntas.length; i++) {
            System.out.println(perguntas[i]);
            String respostaUsuario = scanner.nextLine();

            if (respostaUsuario.equalsIgnoreCase(respostas[i])) {
                System.out.println("Resposta correta!");
                pontuacao++;
            } else {
                System.out.println("Resposta incorreta. A resposta correta é: " + respostas[i]);
            }
        }

        System.out.println("Fim do quiz!");
        System.out.println("Sua pontuação final é: " + pontuacao + "/" + perguntas.length);
    }

    public static void main(String[] args) {
        String[] perguntas = {
            "Qual é a capital do Brasil?",
            "Quem escreveu 'Dom Quixote'?",
            "Qual é o maior planeta do sistema solar?"
        };

        String[] respostas = {
            "Brasília",
            "Miguel de Cervantes",
            "Júpiter"
        };

        Quiz quiz = new Quiz(perguntas, respostas);
        quiz.jogar();
    }
}
