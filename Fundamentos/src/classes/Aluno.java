/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Aluno {

    private String nome;
    private String email;
    private double ra;
    private boolean estudando;
    private boolean fazendoLicao;

    public Aluno(String nome, String email, double ra, boolean estudando, boolean fazendoLicao) {
        this.nome = nome;
        this.email = email;
        this.ra = ra;
        this.estudando = estudando;
        this.fazendoLicao = fazendoLicao;
    }

    

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", email=" + email + ", ra=" + ra + ", estudando=" + estudando + ", fazendoLicao=" + fazendoLicao + '}';
    }

    

    public boolean estudando() {
        return this.estudando;
    }
    
    public boolean fazendoLicao(){
    return this.fazendoLicao; 
    }
}
