import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc;
        double raio, area, pi = 3.14159;

        sc = new Scanner(System.in);
        raio = sc.nextDouble();
        area = pi * (Math.pow(raio, 2.0));

        System.out.println("A = " + area);
    }
}
