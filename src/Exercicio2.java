import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*Crie um programa que recebe a idade de uma pessoa 
          e verifica se ela é menor de idade (menor que 18 anos) ou maior de idade. */

    System.out.printf("Informe sua idade: ");
    Double UsuarioIdade = scanner.nextDouble();

    if (UsuarioIdade > 18) {
        System.out.println("Parabéns, você tem mais que 18 anos!");
        }
        else{
            System.out.println("Hó não, você tem menos de 18 anos!");
        }
scanner.close();    
}
}
