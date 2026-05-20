import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        Question[] quiz = {
            new Question("Paris est la capitale de la France. (vrai/faux)", "vrai"),
            new Question("2 + 2 = 5. (vrai/faux)", "faux"),
            new Question("Le soleil est une étoile. (vrai/faux)", "vrai"),
            new Question("Java est un langage de programmation. (vrai/faux)", "vrai")
        };

        System.out.println("=== Quiz Géneral ===");
        System.out.println("Il y a " + quiz.length + " questions.");
        System.out.println();

        for (int i = 0; i < quiz.length; i++) {
            System.out.println("Question " + (i + 1) + ": " + quiz[i].getTexte());
            System.out.print("Votre réponse: ");
            String reponse = scanner.nextLine();

            if (quiz[i].verifierReponse(reponse)) {
                System.out.println("✓ Bonne réponse!");
                score++;
            } else {
                System.out.println("✗ Mauvaise réponse.");
            }
            System.out.println();
        }

        System.out.println("Score final: " + score + "/" + quiz.length);
        int pourcentage = (score * 100) / quiz.length;
        System.out.println("Pourcentage: " + pourcentage + "%");
        scanner.close();
    }
}