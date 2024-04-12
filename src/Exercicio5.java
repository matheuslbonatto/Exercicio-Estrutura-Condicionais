import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        /*Escreva um programa que recebe três números do usuário e imprime o maior deles */

        Double Numero1;
        Double Numero2;
        Double Numero3;

        System.out.printf("Informe o Primeiro numero: ");
        Numero1 = scanner.nextDouble();

        System.out.printf("Informe o Segundo numero: ");
        Numero2 = scanner.nextDouble();
        
        System.out.printf("Informe o Terceiro numero: ");
        Numero3 = scanner.nextDouble();

        if (Numero1 > Numero2 && Numero1 > Numero3) {
            System.out.println("O Primeiro numero é o maior: " + Numero1);
            }
        else if (Numero2 > Numero1 && Numero2 > Numero3) {
            System.out.println("O Segundo numero é o maior: " + Numero2); 
        }
        else if (Numero3 > Numero1 && Numero3 > Numero2) {
            System.out.println("O Terceiro numero é o maior: " + Numero3);
        }
        else {
            System.out.println("Não temos um numero maior!");
        }

    
    scanner.close();
    }
    
}
