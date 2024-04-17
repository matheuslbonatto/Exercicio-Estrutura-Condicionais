import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*Escreva um programa que recebe o ano de nascimento de uma pessoa 
        e verifica se é maior de idade ou não (considerando que a maioridade seja aos 18 anos) */

    System.out.printf("Informe o seu ano de nascimento: ");
     int AnoNasci = scanner.nextInt();
     

    if (( 2024 - AnoNasci ) >= 18) {
         System.out.println("Parabéns, você tem mais de 18 anos!");
    }
    else {
        System.out.println("Hó não, você tem menos de 18 anos! ");
    }

    scanner.close();
    }
    
}
