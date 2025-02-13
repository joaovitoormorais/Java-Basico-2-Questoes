import java.util.Scanner;

public class Questão11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o seu peso (em kg):");
        double peso = scan.nextDouble();

        System.out.println("Digite a sua altura (em metros):");
        double altura = scan.nextDouble();

        double Imc = peso / (altura * altura);

        if(Imc < 18.5) {
            System.out.println("Abaixo do peso.");
        }else if(Imc >= 18.5 && Imc < 25) {
            System.out.println("Peso normal.");
        } else if (Imc>= 25 && Imc < 30) {
            System.out.println("Sobrepeso.");
        } else if (Imc >= 30 && Imc < 35) {
            System.out.println("Obesidade grau I.");
        }else if(Imc >= 35 && Imc < 40) {
            System.out.println("Obesidade grau II.");
        }else{
            System.out.println("Obesidade mórbida.");
        }
    }
    }
