/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Carro {

    private String modelo;
    private String marca;
    private CorEnum cor;
    private int ano;
    private int rodas;
    private String situacao;
    private String velocidade;

    public Carro(String modelo, String marca, CorEnum cor, int ano, int rodas) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
        this.rodas = rodas;
        this.situacao = "andando";
        this.velocidade = "rapido";
    }

    public void situacao() {
        this.situacao = "Andando";
    }

    public void velocidade() {
        this.velocidade = "rapido";
    }

    @Override
    public String toString() {
        return "Carro{" + "modelo=" + modelo + ", marca=" + marca + ", cor=" + cor + ", ano=" + ano + ", rodas=" + rodas + ", situacao=" + situacao + ", velocidade=" + velocidade + '}';
    }

}
