/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividades;

/**
 *
 * @author Aluno
 */
public class CategoriaLivros {

    private String romance;
    private String terror;
    private String comedia;
    private String suspense;
    private String educativo;

    public CategoriaLivros(String romance, String terror, String comedia, String suspense, String educativo) {
        this.romance = romance;
        this.terror = terror;
        this.comedia = comedia;
        this.suspense = suspense;
        this.educativo = educativo;
    }

    @Override
    public String toString() {
        return "CategoriaLivros{" + "romance=" + romance + ", terror=" + terror + ", comedia=" + comedia + ", suspense=" + suspense + ", educativo=" + educativo + '}';
    }
    
    
}
