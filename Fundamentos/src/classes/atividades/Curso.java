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
    private CategoriaEnum categoria;
    private int professores;
    private String diasSemanas;

    public Curso(String nome, String descricao, CategoriaEnum categoria, int professores, String diasSemanas) {
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
        this.professores = professores;
        this.diasSemanas = diasSemanas;
    }

    @Override
    public String toString() {
        return "Curso{" + "nome=" + nome + ", descricao=" + descricao + ", categoria=" + categoria + ", professores=" + professores + ", diasSemanas=" + diasSemanas + '}';
    }

  

   
    
    public int professores(){
    return this.professores = 2;
    }
    
    public String diasSemana(){
    return this.diasSemanas = "segunda, quarta e sexta";
    }
}
