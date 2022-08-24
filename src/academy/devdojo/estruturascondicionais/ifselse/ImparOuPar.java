package academy.devdojo.estruturascondicionais.ifselse;

/*
16
Dado um determinado número inteiro
imprima se ele é impar ou par
Resto da divisão por 2 se for par sempre vai ser 0
Senão vai ser impar
*/
public class ImparOuPar {
    public static void main(String[] args) {
        int numero = 6;
        if ((numero % 2) == 0) {
            System.out.println("PAR: " + (numero % 2));
        } else {
            System.out.println("IMPAR: " + (numero % 2));
        }
    }
}
