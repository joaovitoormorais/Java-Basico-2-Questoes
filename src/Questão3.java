import java.util.Scanner;

public class Questão3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota do aluno:");
        int primeirNota = scan.nextInt();

        System.out.println("Digite a segunda nota do aluno:");
        int segundaNota = scan.nextInt();

        System.out.println("Digite a terceira nota:");
        int terceiraNota = scan.nextInt();

        double media = (primeirNota + segundaNota + terceiraNota) / 3;

        if(media >= 7) {
            System.out.println("O aluno está aprovado!");
        }else if(media < 4) {
            System.out.println("O aluno foi reprovado!");
        } else if (media > 4 && media < 7) {
            System.out.println("O aluno ficou de recuperação!");
        }
    }
    }

