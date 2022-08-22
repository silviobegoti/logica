import java.util.Scanner;

/*
22
EU, como administrador do sistema, gostaria de permitir que os próprios
usuários cadastrassem o nome de usuário (login) no sistema para agilizar
o processo de migração do sistema antigo para o novo.

O usuário não pode deixar o login vazio "", ou criar um usuário com o login "admin" ou "administrador".
Se o valor entrado for válido, o sistema deverá exibir uma mensagem <nome do usuário> cadastrado com sucesso,
senão o sistema deverá mostrar o erro "Usuário inválido"
*/
public class CadastroDeLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = input.next();
        if (nome.equals("") || nome.equalsIgnoreCase("admin") || nome.equalsIgnoreCase("administrador")) {
            System.out.println("Usuário Inválido!!!");
        } else {
            System.out.println(nome + " Cadastrado com Sucesso...");
        }
    }

}
