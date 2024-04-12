import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
    /*Faça um programa que solicita ao usuário a temperatura em graus Celsius 
    e converte para Fahrenheit, seguindo a fórmula: F = (C * 9/5) + 32. 
    Certifique-se de que o programa imprime uma mensagem de alerta caso a temperatura em Celsius seja menor
    que -273.15 (zero absoluto). */
    
System.out.printf("Infome a temperatura em graus Celcius: ");
double GrausCelcius = scanner.nextDouble();

double Conversao = (((GrausCelcius * 9)/5) + 32) ; 
double Fahrenheit = -273.15;

if (Conversao < Fahrenheit) {
    System.out.println("Zero Absoluto");
}
else {
    System.out.println( Conversao + " Fahrenheit");
}

scanner.close();
}    
}
