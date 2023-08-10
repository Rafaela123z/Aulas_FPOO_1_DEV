

package aulaestruturadecisao;

import java.util.Scanner;


public class Atividade02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual a largura do seu terreno?");
        double largura = scanner.nextDouble();
        System.out.println("Qual o comprimento do seu terreno?");
        double comprimento = scanner.nextDouble();
        double valorM;
        double areaTotal = largura * comprimento;
        double valorFinal = 0;
        
        if (areaTotal <= 250) {
            valorM = 8.50;
            valorFinal = valorM * areaTotal;
            
        } else if (areaTotal <= 350) {
            valorM = 9.50;
            valorFinal = valorM * areaTotal;

        } else if (areaTotal > 350){
            valorM = 11.50;
            valorFinal = valorM * areaTotal;
        }
        System.out.println("O valor a ser pago pela construcao do seu imovel sera de " + valorFinal);
    }
}
