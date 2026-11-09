
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 5 numeros inteiros aleatórios: ");
        int[] vetorInt = new int[5];
        for (int i=0; i < vetorInt.length; i++ ){
            vetorInt[i] = sc.nextInt();
        }

        int escolha;

        do {
            System.out.println("Digite 1 para ordenar crescente ou 2 para ordenar decrescente");
            escolha = sc.nextInt();

            if (escolha == 1) {
                ordenaVetorCrescente(vetorInt);
            } else if (escolha == 2) {
                ordenaVetorDecrescente(vetorInt);
            } else {
                System.out.println("Opção inválida");
            }
        } while (escolha != 1 && escolha != 2);

        sc.nextLine();
//      OPERAÇAO NOME

        System.out.println("Digite um nome: ");
        String nome = sc.nextLine();

        contaVogais(nome);

        sc.close();




    }
    // bubble sort
    private static void ordenaVetorDecrescente(int[] vetorInt){
        for (int i=0; i < vetorInt.length; i++){
            for (int j = i; j < vetorInt.length; j++) {
                // SEMPRE USAR UMA VARIAVEL AUX PARA REALIZAR A OPERACAO
                if (vetorInt[j] > vetorInt[i]){
                    int auxInt = vetorInt[i];
                    vetorInt[i] = vetorInt[j];
                    vetorInt[j] = auxInt;

                }
            }
        }
        exibeVetor(vetorInt);
    }

    // bubble sort
    private static void ordenaVetorCrescente(int[] vetorInt){
        for (int i=0; i < vetorInt.length; i++){
            for (int j = i; j < vetorInt.length; j++) {
                // SEMPRE USAR UMA VARIAVEL AUX PARA REALIZAR A OPERACAO
                if (vetorInt[j] < vetorInt[i]){
                    int auxInt = vetorInt[i];
                    vetorInt[i] = vetorInt[j];
                    vetorInt[j] = auxInt;

                }
            }
        }
        exibeVetor(vetorInt);
    }


    private static void exibeVetor (int[] vetor){
        for (int i=0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }
    }

    private static void contaVogais (String nome){
        int contador = 0;
        String vogais = "aeiouAEIOU";

        for (char c : nome.toCharArray()) {
            if (vogais.indexOf(c) != -1){
                contador++;
            }
        }
        System.out.println("Quantidade de vogais: " + contador);
    }
}