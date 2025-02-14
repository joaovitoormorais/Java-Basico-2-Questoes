import java.util.Scanner;

public class Questão7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int primeiroNumero = scan.nextInt();

        System.out.println("Digite o segundo número:");
        int segundoNumero = scan.nextInt();

        System.out.println("Digite uma opção: 1- adição, 2- subtração, 3- multiplicaçao" +
                "4- divisão");
            int opcao = scan.nextInt();

            if(opcao == 1) {
                System.out.println(primeiroNumero + segundoNumero);
            } else if (opcao == 2) {
                System.out.println(primeiroNumero - segundoNumero);
            } else if (opcao == 3) {
                System.out.println(primeiroNumero * segundoNumero);
            } else if (opcao == 4) {
                System.out.println(primeiroNumero / segundoNumero);
            }else{
                System.out.println("Opção inválida, Tente novamente.");
            }
    }
    }
