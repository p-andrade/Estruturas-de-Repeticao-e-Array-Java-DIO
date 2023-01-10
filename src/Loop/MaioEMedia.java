package Loop;

import java.util.Scanner;

public class MaioEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float numero;
        float soma = 0;
        float maior = 0;

        float count = 1;
        do {
            System.out.println("Número " + count + ": ");
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > maior) maior = numero;

            count = count + 1;
        } while(count <= 5);

        System.out.println("Maior: " + maior);
        System.out.println("Média: " + (soma/5));

    }
}
