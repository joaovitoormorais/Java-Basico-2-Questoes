import java.util.Scanner;

public class Questão14 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a hora do dia:");
        double hora = scan.nextDouble();

        if(hora >= 0 && hora < 12) {
            System.out.println("Bom dia.");
        }else if (hora >= 12 && hora < 18) {
            System.out.println("Boa tarde.");
        }else{
            System.out.println("Boa noite.");
        }
    }
}
