import java.util.Scanner;

public class SomarValores {
  public static void main(String[] args) {
    float value1;
    float value2;
    Scanner numberIn = new Scanner(System.in);

    System.out.println("Digite o numero 1: ");
    value1 = numberIn.nextFloat();
    System.out.println("Digite o numero 2: ");
    value2 = numberIn.nextFloat();

    System.out.println("A Soma e: " + (value1 + value2));
    numberIn.close();
  }
}
