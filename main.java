import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int score = 0;

        System.out.println("=== Petit Quiz ===");

        // Question 1
        System.out.println("Paris est la capitale de la France.");
        System.out.print("Écris vrai : ");

        String r1 = scanner.nextLine();

        if (r1.equals("vrai")) {
            System.out.println("Bonne réponse !");
            score++;
        } else {
            System.out.println("Mauvaise réponse !");
        }

        System.out.println();

        // Question 2
        System.out.println("2 + 2 = 5.");
        System.out.print("Écris faux : ");

        String r2 = scanner.nextLine();

        if (r2.equals("faux")) {
            System.out.println("Bonne réponse !");
            score++;
        } else {
            System.out.println("Mauvaise réponse !");
        }

        System.out.println();
        System.out.println("Score final : " + score + "/2");

        scanner.close();
    }
}