package Array;

public class OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {-5,-4,10,11,50};

        System.out.print("Vetor: ");
        int count = 0;
        while (count < (vetor.length) ){
            System.out.print(vetor[count] + " ");
            count++;
        }
        System.out.print("\nVetor Inverso: ");
        for(int i= (vetor.length - 1); i>=0; i--){
            System.out.print(vetor[i] + " ");
        }
    }
}
