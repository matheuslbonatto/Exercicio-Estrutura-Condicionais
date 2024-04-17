import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    /*Faça um programa que recebe a altura e o sexo (M/F) de uma pessoa e verifica se ela
      está dentro dos padrões de altura considerados normais para o sexo informado
      (homens com altura entre 160 e 190 cm, mulheres entre 150 e 180 cm). */

    double altura ;
    char sexo ;

    System.out.printf("Informe sua altura: ");
    altura = scanner.nextDouble();

    System.out.printf("Informe seu sexo M/F: ");
    sexo = scanner.next().charAt(0);

       if ((sexo == 'M' && altura >= 160 && altura <= 190 ) ||
          (sexo == 'F' && altura >= 150 && altura <= 180)) 
    {
        System.out.println("Paranbéns,você está dentro dos padrões de altura considerados normais!");
    } else {
        System.out.println("Você não esta dentro dos padrões!");
    }

    scanner.close();
    }
    
}
