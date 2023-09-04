public class BubbleSort {
    public static void main(String[] args) throws Exception {
        int[] vetor = { 35, 4, 6, 8, 10, 70, 11, 64, 16, 75, 45, 3, 55, 7, 58, 5, 60, 66, 9 };
        int temp;

        mostraVetor(vetor);
        System.out.println("");

        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    // Se o valor atual > valor da frente dele, inverte
                    // Como se estivesse 'empurrando' o valor até ele
                    // encontrar um valor maior que ele
                    // Vai jogando o valor atual pro fim do vetor
                    // até encontrar alguem maior que ele

                    temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
            mostraVetor(vetor);
        }
        System.out.println("");
        mostraVetor(vetor);
    }

    private static void mostraVetor(int[] v) {
        System.out.print("Vetor \n[");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i]);
            if (i < v.length - 1)
                System.out.print(',');

        }
        System.out.println("]");
    }
}
