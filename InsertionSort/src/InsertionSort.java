public class InsertionSort {
    public static void main(String[] args) throws Exception {
        int[] vetor = { 35, 4, 6, 8, 10, 70, 11, 64, 16, 75, 45, 3, 55, 7, 58, 5, 60, 66, 9 };
        int valor;
        int posAnterior;

        for (int posAtual = 1; posAtual < vetor.length; posAtual++) {
            valor = vetor[posAtual];
            posAnterior = posAtual - 1;

            mostraVetor(vetor);

            while (posAnterior >= 0 && vetor[posAnterior] > valor) {
                vetor[posAnterior + 1] = vetor[posAnterior];
                posAnterior = posAnterior - 1;
            }
            vetor[posAnterior + 1] = valor;
        }
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
