package aulaestruturadecisao;

import java.util.Scanner;

public class Atividade04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual produto voce deseja comprar? Digite 1 para notebook. Digite 2 para celular. Digite 3 para carro. Digite 4 apartamento");
        int produto = scanner.nextInt();
        double valorProduto;
        double parcela = 0;
        double meses = 0;

        if (produto == 1) {
            valorProduto = 3299;
            parcela = valorProduto * 0.05;
            meses = valorProduto / parcela;
        } else if (produto == 2) {
            valorProduto = 1789;
            parcela = valorProduto * 0.10;
            meses = valorProduto / parcela;
        } else if (produto == 3) {
            valorProduto = 68000;
            parcela = valorProduto * 0.02;
            meses = valorProduto / parcela;
        } else if (produto == 4) {
            valorProduto = 180000;
            parcela = valorProduto * 0.01;
            meses = valorProduto / parcela;
        }
        System.out.println("O preco da parcela sera: " + parcela + " e serao " + meses + "parcelas");
    }
}
