import java.util.Scanner;

public class Exercice1 {
    public static void execute() {
        System.out.println("Entrez un nombre : ");

        Scanner scanner = new Scanner(System.in);
        int nombre = scanner.nextInt();

        System.out.println(fibbonaci(nombre));
    }

    private static String fibbonaci(int nombre) {
        int cpt = 0;
        StringBuilder suite = new StringBuilder();
        int prec = 1, suc = 1;
        do {
            if (cpt < 3) {
                if (cpt == 0) {
                    suite.append(cpt).append(" ");
                } else {
                    suite.append(prec).append(" ");
                }
            } else {
                int stockSuc = suc;
                suc += prec;
                prec = stockSuc;

                if (suc <= nombre) {
                    suite.append(suc).append(" ");
                }
            }

            cpt++;
        } while (suc <= nombre);

        return suite.toString();
    }
}
