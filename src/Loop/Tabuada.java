package Loop;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quantNumeros = 10;
        int numero;
        int count =1;
        int multi;

        System.out.println("Informe um Número: ");
        numero = scan.nextInt();

        do {
            multi = count * numero;
            System.out.println( count + " x " + numero +" = " + multi );
            count++;
        } while (count <= quantNumeros);

        System.out.println("Loop.Tabuada: ");
        int tabuada = scan.nextInt();

        System.out.println("Loop.Tabuada de " + tabuada);
        for(int i = 1; i <= 10; i = i + 1) {
            System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
        }


    }
}
