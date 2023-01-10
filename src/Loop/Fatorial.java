package Loop;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int fatorial = scan.nextInt();
        int multi = 1;

        System.out.print(fatorial + "! = ");
        for (int i = fatorial; i >=1; i--){
            multi = multi * i;
            if (i > 1) System.out.print(i +" x ");
            else System.out.print(i);
        }
        System.out.println(" = "+ multi);
    }
}
