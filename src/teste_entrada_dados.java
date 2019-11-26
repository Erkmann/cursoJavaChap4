import java.util.Scanner;

public class teste_entrada_dados {

    public static void main(String[] args){

        String x;
        Scanner sc = new Scanner(System.in);

        x = sc.nextLine();
        System.out.println("Voce digitou: " + x);

        sc.close();

    }

}
