/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.beans.PropertyChangeSupport;
import java.math.BigDecimal;

/**
 *
 * @author ALO
 */
public class Devolucion extends BaseModel {

    public static final String PROP_IDDEVOLUCION = "PROP_IDDEVOLUCION";
    public static final String PROP_STATUS = "STATUS";
    public static final String PROP_IDPRESTAMO = "PROP_IDPRESTAMO";

    private BigDecimal iddevolucion;
    private String status;
    private BigDecimal idprestamo;

    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);

    public BigDecimal getIddevolucion() {
        return iddevolucion;
    }

    public void setIddevolucion(BigDecimal iddevolucion) {

        java.math.BigDecimal oldIddevolucion = this.iddevolucion;
        this.iddevolucion = iddevolucion;
        propertyChangeSupport.firePropertyChange(PROP_IDDEVOLUCION, oldIddevolucion, iddevolucion);

    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        java.lang.String oldStatus = this.status;
        this.status = status;
        propertyChangeSupport.firePropertyChange(PROP_STATUS, oldStatus, status);
    }

    public BigDecimal getIdprestamo() {
        return idprestamo;
    }

    public void setIdprestamo(BigDecimal idprestamo) {
        java.math.BigDecimal oldIdprestamo = this.idprestamo;
        this.idprestamo = idprestamo;
        propertyChangeSupport.firePropertyChange(PROP_IDPRESTAMO, oldIdprestamo, idprestamo);
    }

}
