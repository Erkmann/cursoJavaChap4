import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc;
        int a, b;

        sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("SOMA = " + (a + b));
        sc.close();

    }
}
