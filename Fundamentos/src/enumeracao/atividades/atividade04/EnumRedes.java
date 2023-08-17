/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividades.atividade04;

/**
 *
 * @author Aluno
 */
public enum EnumRedes {
    FOTOS("Fotos"), VIDEOS("Videos"), POST("Post");
    private String rede;

    public String getRede() {
        return rede;
    }

    @Override
    public String toString() {
        return "EnumRedes{" + "rede=" + rede + '}';
    }

    private EnumRedes(String rede) {
        this.rede = rede;
    }
}
