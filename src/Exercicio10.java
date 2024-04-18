import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        /*Crie um programa que recebe o salário de um funcionário 
          e verifica se ele está acima do salário mínimo atual */
    double salario;
    final double salarioBase = 1412.00;

    System.out.printf("Informe seu salário: ");
    salario = scanner.nextDouble();

if (salario > salarioBase) {

    System.out.println("Você está ganhando mais que o salario base, parabéns!");
    
} 
else {
    System.out.println("Vish, está na hora de pedir um aumento salarial :/");
}

scanner.close();
}
    
}
