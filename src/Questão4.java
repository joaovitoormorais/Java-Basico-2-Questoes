import java.util.Scanner;

public class Questão4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a sua idade:");
        int idade = scan.nextInt();

        if(idade >= 18 && idade < 70) {
            System.out.println("O voto é obrigatório!");
        } else if (idade >= 16 && idade >= 70) {
            System.out.println("O voto é facultativo.");
        }else{
            System.out.println("O voto é proibido!");
        }
    }
    }