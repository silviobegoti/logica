/*
Crie uma classe que calcule uma determninada porcentagem de um dado salário
Criar uma classe
Aceitar um valor de entrada para salário
Definir o valor da porcentagem (perguntar quanto cliente?) = 30%
Calcular  a porcentagem
 */
public class CalculadoraImposto {
    public static void main(String[] args){
        float salario = 2500.00F;
        float porcentagem = 30L;
        double porcentagemDoSalario = salario * (porcentagem / 100);
        System.out.println(porcentagemDoSalario);
    }
}
