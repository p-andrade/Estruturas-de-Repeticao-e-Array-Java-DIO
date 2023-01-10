package Loop;

import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0, quantImpares = 0;
        int count =0;

        System.out.println("Informe a Quantidade de Números: ");
        quantNumeros = scan.nextInt();

        do {
            System.out.println("Número " + count + ": ");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantPares++;
            else quantImpares++;

            count++;
        } while (count < quantNumeros);

        System.out.println("Quantidade de Números Pares: " + quantPares);
        System.out.println("Quantidade de Números Impares: " + quantImpares);
    }
}
