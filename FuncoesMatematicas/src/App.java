import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a base a exponenciação: ");
        Double base = sc.nextDouble();

        System.out.print("Digite o expoente: ");
        Double expoente = sc.nextDouble();

        System.out.printf("%.2f Elevado a %.2f é igual a %.2f%n", base, expoente, Math.pow(base, expoente));

        System.out.print("Digite um valor para se calcular a raiz quadrada: ");

        Double valorRaiz = sc.nextDouble();
        System.out.println(Math.sqrt(valorRaiz));

        sc.close();

    }
}
