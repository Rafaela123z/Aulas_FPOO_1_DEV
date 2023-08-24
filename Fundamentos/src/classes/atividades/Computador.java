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
    private MemoriaEnum memoria;
    private ProcessadorEnum processador;
    private int capacidadeDisco;
    private String sistemaOperacional;

    public Computador(MemoriaEnum memoria, ProcessadorEnum processador, int capacidadeDisco, String sistemaOperacional) {
        this.memoria = memoria;
        this.processador = processador;
        this.capacidadeDisco = capacidadeDisco;
        this.sistemaOperacional = sistemaOperacional;
    }

    @Override
    public String toString() {
        return "Computador{" + "memoria=" + memoria + ", processador=" + processador + ", capacidadeDisco=" + capacidadeDisco + ", sistemaOperacional=" + sistemaOperacional + '}';
    }
     
    public void tipoSistema(){
    this.sistemaOperacional = "windows";
    }
    public ProcessadorEnum rodaJogosPesados(){
    return this.processador = ProcessadorEnum.RYZEN; 
    }
    
}
