import java.util.Scanner;

public class Exercice3 {
    public static void execute() {
        Scanner scanner = new Scanner(System.in);
        double input;
        int nbPositifs = 0;
        int nbNegatifs = 0;
        int nbZero = 0;
        System.out.println("Entrez un nombre, tapez une lettre si vous avez fini!");
        do {
            try {
                input = scanner.nextDouble();
                if (input > 0) {
                    nbPositifs++;
                } else if (input < 0) {
                    nbNegatifs++;
                } else {
                    nbZero++;
                }
            } catch (Exception ex) {
                //ex.printStackTrace();
                break;
            }
        } while (true);

        System.out.println("Nombres postifs: " + nbPositifs);
        System.out.println("Nombres négatifs: " + nbNegatifs);
        System.out.println("Nombres zéros: " + nbZero);
    }
}
