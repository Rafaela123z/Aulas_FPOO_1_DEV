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
    private String cor;
    private double ano;
    private int rodas;
    private String situacao;
    private boolean passageiros;

    public Carro(String modelo, String marca, String cor, double ano, int rodas) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
        this.rodas = rodas;
        this.situacao = "parado";
        this.passageiros = false;
    }

    @Override
    public String toString() {
        return "Carro{" + "modelo=" + modelo + ", marca=" + marca + ", cor=" + cor + ", ano=" + ano + ", rodas=" + rodas + ", situacao=" + situacao + ", passageiros=" + passageiros + '}';
    }
    
    public void andando(){
   this.situacao = " Em movimento";
this.passageiros = true;
    }
    
    public void parado(){
    this.passageiros = false;
    this.situacao = " Parado";
    }
}
