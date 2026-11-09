import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros deseja inserir? ");
        int n = sc.nextInt();

        int[] vetor = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            vetor[i] = sc.nextInt();
        }
        //OPERACAO PAR E IMPAR

        for (int i = 0; i < n; i++) {
            if (vetor[i] % 2 == 0) {
                vetor[i] = vetor[i] * 2;
            } else {
                vetor[i] = (int) Math.pow(vetor[i], 2);
            }
        }

        System.out.println("Novo vetor:");
        for (int valor : vetor) {
            System.out.println(valor);
        }

        sc.close();
    }
}