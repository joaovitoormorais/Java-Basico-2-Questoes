import java.util.Scanner;

public class Questão12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro (de 1 até 7):");
        int num = scan.nextInt();

        if(num == 1) {
            System.out.println("domingo");
        }else if(num == 2) {
            System.out.println("segunda-feira");
        } else if (num == 3) {
            System.out.println("terça-feira");
        } else if (num == 4) {
            System.out.println("quarta-feira");
        } else if (num == 5) {
            System.out.println("quinta-feira");
        } else if (num == 6) {
            System.out.println("sexta-feira");
        } else if (num == 7) {
            System.out.println("sábado");
        }else {
            System.out.println("Errou, tente novamente.");
    }
    }
    }
