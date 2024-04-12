import java.util.Scanner;

public class Exercicio4 {       
    public static void main(String [] args){
    Scanner scanner = new Scanner(System.in);
    
    /*Desenvolva um programa que verifica se um número é divisível por 7. */
    int Dividendo ;
    int Divisor = 7;
    int Resultado ;

    System.out.printf("Informe um nuemro: ");
    Dividendo = scanner.nextInt();

    //Divisão da operação
    
    Resultado = Divisor % Dividendo ;

    if (Resultado == 0) {
        System.out.println("É divisivel por 7");
        }
    else{
        System.out.println("Não é divisivel por 7");
    }
 scanner.close();
}   
}

