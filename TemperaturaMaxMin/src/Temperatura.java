import java.util.Scanner;

public class Temperatura {
  public static void main(String[] args) {
    int[] maxtemp = new int[7];
    int[] mintemp = new int[7];
    Scanner opcao = new Scanner(System.in);
    int escolha = 0;

    while (escolha != 9) {
      System.out.println("-----------Menu---------");
      System.out.println("1 - Inserir temperaturas maxiams e minimas");
      System.out.println("2 - Mostrar Temperaturas maxiams e minimas");
      System.out.println("9 - Encerrar");
      System.out.println("------------------------");
      System.out.print("Escolha a opcao: ");
      escolha = opcao.nextInt();

      if (escolha == 1) {
        Scanner numeroInformado = new Scanner(System.in);
        for (int i = 0; i < maxtemp.length; i++) {
          System.out.println("Dia:" + (i + 1));
          System.out.println("Digite a temperatura maxima: \n");
          maxtemp[i] = numeroInformado.nextInt();
          System.out.println("Digite a temperatura minima: \n");
          mintemp[i] = numeroInformado.nextInt();
        }
        numeroInformado.close();
        System.out.println("Temperaturas Cadastradas");
      } else if (escolha == 2) {
        for (int i = 0; i < mintemp.length; i++) {
          System.out.println("Dia: " + (i + 1));
          System.out.println("Temperatura maxima: " + maxtemp[i]);
          System.out.println("Temperatura minima: " + mintemp[i]);

        }
      }
    }
    opcao.close();
  }
}