import java.util.Scanner;

/*
23
Como secretário de alistamento militar eu gostaria que meu sistema aceitasse os seguintes parâmetros
para que eu possa agilizar o processo de cadastramento:
sexo, sendi válido apenas M ou F e idade;
Se o sexo for Masculino e a idade for maior ou igual a 18 o sistema deve imprimir, alistamento obrigatório.
Se o sexo for Masculino e a idade for menor que 18 o sistema deve imprimir, alistamento não permitido.
Se o sexo for Feminino e a idade for maior ou igual a 18 o sistema deve perguntar se a pessoa deseja se alistar.
Se o sexo for Feminino e a idade for menor que 18 o sistema deve imprimir, alistamento não permitido.
*/
/*
public class AlistamentoMilitar1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o Sexo (M) ou (F): ");
        String sexo = input.next();
        System.out.println("Digit a Idade: ");
        int idade = input.nextInt();
        if ((sexo == 'M' || sexo == 'F') && idade < 18) {
            System.out.println("Alistamento não permitido!!!");
        } else if (sexo == "M" && idade>=18) {
            System.out.println("Alistamento Obrigatório!!!");
        } else if (idade >= 18 || sexo == 'F') {
            System.out.println("Deseja se alistar?");

        }
    }

}
/*