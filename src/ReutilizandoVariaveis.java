/*
Crie uma variável que irá guradar o valor de um salário;
Calcule a porcentagem desse salário, os valores da porcentagem
serão:
*30%
*15%
*5%
A cada vez que você calcular guarde o resultado em uma variável
Imprima o resultado e reutilize a variável que guarde o resultado
para o novo cálculo, repetindo o processo
*/
public class ReutilizandoVariaveis {
    public static void main(String[] args){
        double salario = 10000;
        double resultado = salario * 0.3;
        System.out.println("30% eh: "+resultado);
        resultado = salario * 0.15;
        System.out.println("15% eh: "+resultado);
        resultado = salario * 0.05;
        System.out.println("5% eh: "+resultado);
    }
}
