/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividades.atividade02;

/**
 *
 * @author Aluno
 */
public enum EnumLivros {
    ROMANCE("Romance"), FANTASIA("Fantasia"), TERROR("Terror"), AUTOAJUDA("Auto ajuda"), HISTORIA("Historia"), DISTOPIA("Distopia");
    private String livros;

    public String getLivros() {
        return livros;
    }

    private EnumLivros(String livros) {
        this.livros = livros;
    }
}
