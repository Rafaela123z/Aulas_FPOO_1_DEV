/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividades.atividade03;

/**
 *
 * @author Aluno
 */
public class Produtos {

    public static void main(String[] args) {
        ClasseProdutos acompanhamentos = new ClasseProdutos(EnumProdutos.ACOMPANHAMENTOS.getProdutos());
        System.out.println(acompanhamentos);
        ClasseProdutos bebidas = new ClasseProdutos(EnumProdutos.BEBIDAS.getProdutos());
        System.out.println(bebidas);
        ClasseProdutos sobremesas = new ClasseProdutos(EnumProdutos.SOBREMESAS.getProdutos());
        System.out.println(sobremesas);
    }
}
