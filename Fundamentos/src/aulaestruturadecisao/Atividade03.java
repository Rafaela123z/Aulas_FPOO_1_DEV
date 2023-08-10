

package aulaestruturadecisao;

import java.util.Scanner;


public class Atividade03 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Qual prato voce deseja? Opcao 1: arroz, feijao e bife acebolado. Opcao 2: arroz, feijao e file de frango. Opcao 3: arroz, feijao e brajola. Digite o numero da opcao que deseja.");
            double prato = scanner.nextDouble();
            System.out.println("Quantos pratos voce deseja?");
            int quantidade = scanner.nextInt();
            double valorFinal = 0;
            
            if (prato == 1) {
            prato = 19.99;
            valorFinal = prato * quantidade;
        } else if (prato == 2 ) {
            prato = 18.99;
            valorFinal = prato * quantidade;
        } else if (prato == 3){
        prato = 23.99;
        valorFinal = prato * quantidade;
        }
            System.out.println("O valor final do seu pedido e " + valorFinal);
    }
}
