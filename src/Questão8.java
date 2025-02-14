import java.util.Scanner;

public class Questão8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o preço do produto (em reais:");
        double preco = scan.nextDouble();

        System.out.println("Digite a forma de pagamento (1- á vista, 2- Cartão de débito," +
                "3- Cartão de crédito):");
        int formaPagamento = scan.nextInt();

        double valorFinal;

        if(formaPagamento == 2 || formaPagamento == 3) {
            valorFinal = preco * 0.9;
        }else{
            valorFinal = preco;
        }

    System.out.println("o valor final da compra em R$ foi de:" + valorFinal);
    }
}
