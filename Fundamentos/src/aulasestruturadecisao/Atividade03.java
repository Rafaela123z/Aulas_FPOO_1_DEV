package aulasestruturadecisao;

import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Qual prato voce deseja pedir?");
        double prato = scanner.nextDouble();
        
        System.out.println("Quantos pratos voce deseja pedir?");
        int pratoQtde = scanner.nextInt();
        double valorPrato =0; 
        
        if (prato == 1) {
        prato = 19.99;
        valorPrato = prato * pratoQtde;
        } else if (prato == 2) {
            prato = 18.99;
            valorPrato = prato * pratoQtde;
        } else if (prato ==3) {
            prato = 23.99;
            valorPrato = prato * pratoQtde;
        }
         System.out.println("O valor do seu pedido e " + valorPrato);  
    }
}
