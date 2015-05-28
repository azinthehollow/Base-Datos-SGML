/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.enums;

/**
 *
 * @author ALO
 */
public enum Estatus {
    PRESTADO("Prestado"), DEVUELTO("Devuelto");

    
    private String mensaje;

    Estatus(String mensaje) {
        this.mensaje = mensaje;
    }
    /**
     * @return the mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * @param mensaje the mensaje to set
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
    
}
