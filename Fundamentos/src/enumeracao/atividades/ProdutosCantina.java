/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividades;

/**
 *
 * @author Aluno
 */
public class ProdutosCantina {

    private String trufa;
    private String balas;
    private String pirulito;
    private String pacoca;
    private String refrigerante;
    private String suco;
    private String lanche;
    private String salgado;

    public ProdutosCantina(String trufa, String balas, String pirulito, String pacoca, String refrigerante, String suco, String lanche, String salgado) {
        this.trufa = trufa;
        this.balas = balas;
        this.pirulito = pirulito;
        this.pacoca = pacoca;
        this.refrigerante = refrigerante;
        this.suco = suco;
        this.lanche = lanche;
        this.salgado = salgado;
    }

    @Override
    public String toString() {
        return "ProdutosCantina{" + "trufa=" + trufa + ", balas=" + balas + ", pirulito=" + pirulito + ", pacoca=" + pacoca + ", refrigerante=" + refrigerante + ", suco=" + suco + ", lanche=" + lanche + ", salgado=" + salgado + '}';
    }
    
    
}
