/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividades;

/**
 *
 * @author Aluno
 */
public enum CategoriaEnum {
    DESENVOLVIMENTO_DE_SISTEMAS("Desenvolvimento de Sistemas"), QUALIDADE("Qualidade"), ELETROELETRONICA("Eletroeletrônica"), ELETROMECANICA("Eletromecânica");
    
    private String tipoCurso;

    private CategoriaEnum(String tipoCurso) {
        this.tipoCurso = tipoCurso;
    }

    public String getTipoCurso() {
        return tipoCurso;
    }
    
    
}
