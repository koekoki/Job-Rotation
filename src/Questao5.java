import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva uma frase: ");
        String input = sc.next();
        System.out.println("Frase invertida: ");
        for(int i = input.length()-1; 0 <= i; i--) {
            System.out.print(input.charAt(i));
        }
    }
}
