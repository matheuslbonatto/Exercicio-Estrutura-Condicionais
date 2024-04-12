import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    Double nota;

    /* Crie um programa que pede ao usuário para digitar sua nota em uma disciplina 
       e imprime se ele foi aprovado (nota maior ou igual a 6) ou reprovado.*/

    System.out.printf("Informe sua nota: ");
    nota = scanner.nextDouble();

    //Condição
    if (nota > 6) {
        System.out.println("Parabéns Aproado!");        
    }
    else{
        System.out.println("Vish Reprovado!");
    }


scanner.close();
    }
    
}
