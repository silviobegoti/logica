/*
15
Dado um determinado salário
se o salário for maior que 4500 imprima 30% do valor
senão imprima 15% do valor
*/public class CalculadoraImpostoComCondicional {
    public static void main(String[] args) {
        float salario = 4000F;
        if (salario > 4500) {
            float trintaPorCento = salario * 0.3F;
            System.out.println("Imposto 30%: " + trintaPorCento);
        } else {
            float quinzePorCento = salario * 0.15F;
            System.out.println("Imposto 15%: " + quinzePorCento);
        }
    }
}
