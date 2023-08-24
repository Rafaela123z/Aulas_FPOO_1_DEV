/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividades;

/**
 *
 * @author Aluno
 */
public enum ProcessadorEnum {
    RYZEN("Ryzen"), INTEL("Intel");
    
    private String tipoProcessador;

    private ProcessadorEnum(String tipoProcessador) {
        this.tipoProcessador = tipoProcessador;
    }

    public String getTipoProcessador() {
        return tipoProcessador;
    }
    
}
