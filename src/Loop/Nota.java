package Loop;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Digite a Loop.Nota: ");
        nota = scan.nextInt();

        while (0 < nota | nota >= 10) {
            System.out.println("Loop.Nota Inválida!! Digite Novamente: ");
            nota = scan.nextInt();
        }
    }
}
