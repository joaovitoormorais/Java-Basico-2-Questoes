import java.util.Scanner;

public class Questão9 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double temperaturaCelsius;
        int opcao;

        System.out.println("Digite a temperatura (em celsius):");
        temperaturaCelsius = scan.nextDouble();

       System.out.println("Digite a temperatura que você quer converter 1- fahrenheit, 2- Kelvin");
        opcao = scan.nextInt();

        if(opcao == 1) {
            double temperaturaFahrenheit = (temperaturaCelsius * 9 / 5) + 32;
            System.out.println("A temperatura em graus Fahrenheit é de:" + temperaturaFahrenheit);
        }else {
            double temperaturaKelvin = (temperaturaCelsius + 273.15);
            System.out.println("A temperatura em kelvin é de:" + temperaturaKelvin);
        }

    }
}
