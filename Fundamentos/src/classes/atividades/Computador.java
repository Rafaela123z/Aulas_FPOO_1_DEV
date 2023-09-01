/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividades;

/**
 *
 * @author Aluno
 */
public class Computador {

    private ComputadorMemoriaEnum memoria;
    private ComputadorProcessadorEnum processador;
    private int capacidadeDisco;
    private String sistemaOperacional;
    private boolean capacidadeDeDisco;

    public Computador(ComputadorMemoriaEnum memoria, ComputadorProcessadorEnum processador, int capacidadeDisco, String sistemaOperacional, boolean capacidadeDeDisco) {
        this.memoria = memoria;
        this.processador = processador;
        this.capacidadeDisco = capacidadeDisco;
        this.sistemaOperacional = sistemaOperacional;
        this.capacidadeDeDisco = capacidadeDeDisco;
    }

    public boolean capacidadeDeDisco() {
        return this.capacidadeDeDisco;
    }

    public void sistema(String sistemaOperacional) {
        this.sistemaOperacional = "windows";

    }

    @Override
    public String toString() {
        return "Computador{" + "memoria=" + memoria + ", processador=" + processador + ", capacidadeDisco=" + capacidadeDisco + ", sistemaOperacional=" + sistemaOperacional + ", capacidadeDeDisco=" + capacidadeDeDisco + '}';
    }

}
