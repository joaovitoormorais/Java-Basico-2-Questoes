import java.util.Scanner;

public class Questão5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o mês do ano (de 1 até 12):");
        int mesdoAno = scan.nextInt();

        if(mesdoAno == 1) {
            System.out.println("Janeiro, tem 31 dias!");
        } else if (mesdoAno == 2) {
            System.out.println("Fevereiro, tem 28 dias!");
        }else if(mesdoAno == 3) {
            System.out.println("Março, tem 31 dias!");
        }else if(mesdoAno == 4) {
            System.out.println("Abril, tem 30 dias!");
        }else if(mesdoAno == 5) {
            System.out.println("Maio, tem 31 dias!");
        }else if(mesdoAno == 6) {
            System.out.println("Junho, tem 30 dias!");
        }else if(mesdoAno == 7) {
            System.out.println("Julho, tem 31 dias!");
        }else if(mesdoAno == 8) {
            System.out.println("Agosto, tem 31 dias!");
        }else if(mesdoAno == 9) {
            System.out.println("Setembro, tem 30 dias!");
        }else if(mesdoAno == 10) {
            System.out.println("Outubro, tem 31 dias!");
        }else if(mesdoAno == 11) {
            System.out.println("Novembro, tem 30 das!");
        }else if(mesdoAno == 12) {
            System.out.println("Dezembro, tem 31 dias!");
        }
    }
    }