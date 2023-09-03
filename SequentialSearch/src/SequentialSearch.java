import java.util.Scanner;

public class SequentialSearch {
    public static void main(String[] args) {
        Scanner valorInformado = new Scanner(System.in);
        boolean achei = false;
        int[] vetor = new int[] { 10, 12, 45, 21, 65, 32, 78, 89, 13, 22 };

        System.out.println("Digite o valor a ser procurado:");
        int valorBusca = valorInformado.nextInt();

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valorBusca) {
                System.out.println("Encontrado na posicao:" + (i + 1));
                System.out.println("Valor: " + vetor[i]);
                achei = true;
                break;
            }
        }
        if (achei) {
            System.out.println("Finalizado a busca sequencial do vetor e o valor foi encontrado");
        } else {
            System.out.println("O valor informado nao foi encontrado no vetor.");
        }
        valorInformado.close();
    }
}