import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    /*Faça um programa que recebe um caractere do usuário 
      e verifica se é uma vogal ou consoante. */
    
    //Declarando a char
    char letra ;
    
    System.out.printf("Informe uma letra: ");
    letra = scanner.next().charAt(0);

    //Condição

    if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U'||
        letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ) {
        System.out.printf("A letra %s, é uma vogal!", letra);
    }
    else{
        System.out.printf("A Letra %s, não é uma vogal!", letra);
    }



scanner.close();
}
    
}
