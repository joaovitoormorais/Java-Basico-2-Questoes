import java.util.Scanner;

public class Questão6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite uma letra do alfabeto:");
        String letra = scan.nextLine();

        if(letra.equals("a")) {
            System.out.println("É uma vogal.");
        }else if(letra.equals("e")) {
            System.out.println("É uma vogal.");
        } else if (letra.equals("i")) {
            System.out.println("É uma vogal.");
        }else if(letra.equals("o")) {
            System.out.println("É uma vogal.");
        } else if (letra.equals("u")) {
            System.out.println("É uma vogal.");
        }else{
            System.out.println("É uma consoante.");
    }
    }
    }
