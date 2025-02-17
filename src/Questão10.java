import java.util.Scanner;

public class Questão10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double salario, aumento, salarioAjustado;

        System.out.println("Digite o salário do funcionário (em reais):");
        salario = scan.nextDouble();

        if(salario <= 1500) {
            aumento = salario * 0.15;
        } else if (salario >= 15001 && salario <= 2500) {
            aumento = salario * 0.10;
        }else{
            aumento = salario * 0.05;
        }

        salarioAjustado = salario + aumento;

        System.out.println("O salário ajustado do funcionário em R$ foi de:" + salarioAjustado);
    }
    }
