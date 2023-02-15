import java.util.Scanner;

public class Exercice2 {
    public static void execute() {
        System.out.println("Entrez un nombre : ");

        Scanner scanner = new Scanner(System.in);
        int nombre = scanner.nextInt();

        System.out.println("Le log de " + nombre + " est " + logarithme(nombre));
    }

    private static double logarithme(int n) {
        double log = 0;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                log = 1;
            } else {
                if (i % 2 == 0) {
                    log -= (double) 1 / i;
                } else {
                    log += (double) 1 / i;
                }
            }
        }
        return log;
    }
}
