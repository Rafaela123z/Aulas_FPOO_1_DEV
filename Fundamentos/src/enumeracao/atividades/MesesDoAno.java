/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividades;

/**
 *
 * @author Aluno
 */
public class MesesDoAno {

    private String janeiro;
    private String fevereiro;
    private String março;
    private String abril;
    private String maio;
    private String junho;
    private String julho;
    private String agosto;
    private String setembro;
    private String outubro;
    private String novembro;
    private String dezembro;

    public MesesDoAno(String janeiro, String fevereiro, String março, String abril, String maio, String junho, String julho, String agosto, String setembro, String outubro, String novembro, String dezembro) {
        this.janeiro = janeiro;
        this.fevereiro = fevereiro;
        this.março = março;
        this.abril = abril;
        this.maio = maio;
        this.junho = junho;
        this.julho = julho;
        this.agosto = agosto;
        this.setembro = setembro;
        this.outubro = outubro;
        this.novembro = novembro;
        this.dezembro = dezembro;
    }

    @Override
    public String toString() {
        return "MesesDoAno{" + "janeiro=" + janeiro + ", fevereiro=" + fevereiro + ", mar\u00e7o=" + março + ", abril=" + abril + ", maio=" + maio + ", junho=" + junho + ", julho=" + julho + ", agosto=" + agosto + ", setembro=" + setembro + ", outubro=" + outubro + ", novembro=" + novembro + ", dezembro=" + dezembro + '}';
    }

}


