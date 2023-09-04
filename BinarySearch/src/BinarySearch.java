import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetor = { 3, 4, 5, 6, 7, 8, 9, 10, 11, 16, 35, 45, 55, 58, 60, 64, 66, 70, 75 };
        int esquerda = 0;
        int direita = vetor.length;
        int meio = 0;
        int x;
        String Pausa;

        System.out.println("Digite o valor a ser buscado:");
        x = scan.nextInt();
        while (esquerda <= direita) {
            meio = (esquerda + direita) / 2;

            System.out.println("Esquerda: * " + esquerda);
            System.out.println("Direita: * " + direita);
            System.out.println("Meio: * " + meio);
            System.out.println("Estou procurando:" + x);
            System.out.println("Tecle algo para continuar");
            Pausa = scan.nextLine();
            System.out.println("");

            if (vetor[meio] < x) {
                esquerda = meio + 1;
            } else if (vetor[meio] > x) {
                direita = meio - 1;
            } else if (vetor[meio] == x) {
                System.out.println("Achei o vetor na posicao: " + meio);
                System.out.println("Valor: " + x);
                break;
            }

        }
        scan.close();
    }
}
