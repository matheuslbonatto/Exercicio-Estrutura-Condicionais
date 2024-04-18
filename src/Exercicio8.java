import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    /*Desenvolva um programa que pede ao usuário para digitar um ano 
    e verifica se é bissexto ou não. 
    Um ano é bissexto se for divisível por 4, mas não por 100, a menos que também seja divisível por 400. */
    int ano;
    
    System.out.println("Verificador de Ano Bissexto!");
    System.out.printf("Digite um ano: ");
    ano = scanner.nextInt();
    
    if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
     
        System.out.println(ano + " É um ano bissexto.");
    } else {
        System.out.println(ano + " Não é um ano bissexto.");
    }

    scanner.close();

    }
    
}
