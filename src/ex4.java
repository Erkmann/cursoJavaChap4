import java.util.Locale;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int numero, horas;
        double valorPHora, salario;

        numero = sc.nextInt();
        horas = sc.nextInt();
        valorPHora = sc.nextDouble();

        salario = horas * valorPHora;

        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f%n", salario);

    }
}
