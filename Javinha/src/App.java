import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do primeiro cateto: ");
        Double cateto1 = sc.nextDouble();
        System.out.print("Digite o valor do segundo cateto: ");
        Double cateto2 = sc.nextDouble();

        Double hipotenusa = (double) (Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

        System.out.println(hipotenusa);

        sc.close();
    }
}
