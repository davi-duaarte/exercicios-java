import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um nome: ");
        String nome = sc.nextLine();

        char[] letras = nome.toCharArray();
        int esquerda = 0;
        int direita = letras.length - 1;

        while (esquerda < direita){
            char aux = letras[esquerda];
            letras[esquerda] = letras[direita];
            letras[direita] = aux;
            esquerda++;
            direita--;
        }

        System.out.println("Nome invertido + " + new String(letras));

        sc.close();

    }
}