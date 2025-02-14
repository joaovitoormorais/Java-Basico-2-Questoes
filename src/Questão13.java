import java.util.Scanner;

public class Questão13 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe se o ano é bissexto ou não:");
        int ano = scan.nextInt();

        if(ano % 4 == 0 && ano % 400 == 0) {
            System.out.println("O ano é bissexto.");
        }else {
            System.out.println("Não é bissexto.");
        }
    }
    }
