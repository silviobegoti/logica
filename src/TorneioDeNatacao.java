/*

18

Eu como usuário gostaria de ter o nome e a idade de participantes de
um torneio de natação e que o sistema imprimisse da segiunte forma
* Menor que 10 anos: <Nome> participará da categoria infantil;
* Entre 11 e 15 anos: <Nome> participará da categoria Juvenil;
* Entre 16 e 19 anos: <Nome> participará da categoria Pré-Adulto;
* Acima de 20 anos: <Nome> participará da categoria Adulto;
Para que eu possa rapidamente classificar todos os participantes.
LEITURA COMPLEMENTAR
Processos de desenvolvimento de software
Metodologias ágeis
SCRUM
*/
public class TorneioDeNatacao {
    public static void main(String[] args) {
        String nome = "Lyffy";
        int idade = 9;
        if (idade <= 10) {
            System.out.println(nome + " participará da categoria Infantil");
        } else if (idade >= 11 && idade <= 15) {
            System.out.println(nome + " participará da categoria Junevil");
        } else if (idade >= 16 && idade <= 19) {
            System.out.println(nome + " participará da categoria Pré-Adulto");
        } else {
            System.out.println(nome + " participará da categoria Adulto");
        }
    }
}
