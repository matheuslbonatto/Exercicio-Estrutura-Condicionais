import java.util.Scanner;

public class Exercicio4 {       
    public static void main(String [] args){
    Scanner scanner = new Scanner(System.in);
    
    /*Desenvolva um programa que verifica se um número é divisível por 7. */
    int Dividendo ;
    int Resultado ;

    System.out.printf("Informe um nuemro: ");
    Dividendo = scanner.nextInt();

    //Divisão da operação
    
    Resultado = Dividendo % 7;

    if (Resultado == 0) {
        System.out.printf("O número %d é divisivel por 7", Dividendo);
        }
    else{
        System.out.printf("O número %d não é divisivel por 7", Dividendo);
    }
 scanner.close();
}   
}

