package academy.devdovo.estruturascondicionais;

/*
15
Dado um determinado salário
se o salário for maior que 4500 imprima 30% do valor
senão imprima 15% do valor
Desafio: Utilizr apenas uma variável para guardar o resultado e imprimir no final
Desafio2: Diga na impressão se é 30% ou 15%

*/
public class CalculadoraImpostoComCondicional {
    public static void main(String[] args) {
        float salario = 4800F;
        float resultado = 0F;
        String porcentagem = "";
        if (salario > 4500) {
            resultado = salario * 0.3F;
            porcentagem = "30%";
        } else {
            resultado = salario * 0.15F;
            porcentagem = "15%";
        }
        System.out.println("O valor final em porcentagem de "+porcentagem+" é de "+resultado);
    }
}
