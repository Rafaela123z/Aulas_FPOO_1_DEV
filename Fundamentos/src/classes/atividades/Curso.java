/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividades;

/**
 *
 * @author Aluno
 */
public class Curso {

    private String nome;
    private String descricao;
    private CursoEnum categoria;
    private boolean alunoOuro;
    private String diaCurso;

    public Curso(String nome, String descricao, CursoEnum categoria, boolean alunoOuro, String diaCurso) {
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
        this.alunoOuro = alunoOuro;
        this.diaCurso = diaCurso;
    }

    public boolean alunoOuro() {
        return this.alunoOuro;
    }

    public String dias(String diaCurso) {
        this.diaCurso = "Sabado";
        return null;
    }

    @Override
    public String toString() {
        return "Curso{" + "nome=" + nome + ", descricao=" + descricao + ", categoria=" + categoria + ", alunoOuro=" + alunoOuro + ", diaCurso=" + diaCurso + '}';
    }

}
