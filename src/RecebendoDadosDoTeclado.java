import java.util.Scanner;

public class RecebendoDadosDoTeclado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = teclado.next();
        System.out.println("Digite sua idade: ");
        int idade = teclado.nextInt();
        System.out.println("O nome digitado foi: "+nome);
        System.out.println("O idade digitado foi: "+idade);


    }
}
