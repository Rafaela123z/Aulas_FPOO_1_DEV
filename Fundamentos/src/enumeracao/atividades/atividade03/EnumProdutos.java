/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividades.atividade03;

/**
 *
 * @author Aluno
 */
public enum EnumProdutos {
    SOBREMESAS("Sobremesas"), BEBIDAS("Bebidas"), ACOMPANHAMENTOS("Acompanhamentos"), PRATOS_PRINCIPAIS("Pratos principais"), PRATOS_INFANTIS("Pratos infantis"), PRATOS_GOURMET("Pratos gourmet"), ESPECIARIAS("Especiarias"), PRATOS_EXOTICOS("Pratos exóticos");
    private String produtos;

    public String getProdutos() {
        return produtos;
    }

    private EnumProdutos(String produtos) {
        this.produtos = produtos;
    }
}
