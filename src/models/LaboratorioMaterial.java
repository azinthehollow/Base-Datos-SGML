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
public class LaboratorioMaterial extends BaseModel {
    public static final String PROP_IDLABORATORIO = "PROP_IDLABORATORIO";
    public static final String PROP_IDMATERIAL = "PROP_IDMATERIAL";
    public static final String PROP_EXISTENCIA = "PROP_EXISTENCIA";
    
    private BigDecimal idlaboratorio;
    private BigDecimal idmaterial;
    private BigDecimal existencia;
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);

    public LaboratorioMaterial() {
    }

    public LaboratorioMaterial(BigDecimal idlaboratorio, BigDecimal idmaterial, BigDecimal existencia) {
        this.idlaboratorio = idlaboratorio;
        this.idmaterial = idmaterial;
        this.existencia = existencia;
    }

    /**
     * @return the idlaboratorio
     */
    public BigDecimal getIdlaboratorio() {
        return idlaboratorio;
    }

    /**
     * @param idlaboratorio the idlaboratorio to set
     */
    public void setIdlaboratorio(BigDecimal idlaboratorio) {
        java.math.BigDecimal oldIdlaboratorio = this.idlaboratorio;
        this.idlaboratorio = idlaboratorio;
        propertyChangeSupport.firePropertyChange(PROP_IDLABORATORIO, oldIdlaboratorio, idlaboratorio);
    }

    /**
     * @return the idmaterial
     */
    public BigDecimal getIdmaterial() {
        return idmaterial;
    }

    /**
     * @param idmaterial the idmaterial to set
     */
    public void setIdmaterial(BigDecimal idmaterial) {
        java.math.BigDecimal oldIdmaterial = this.idmaterial;
        this.idmaterial = idmaterial;
        propertyChangeSupport.firePropertyChange(PROP_IDMATERIAL, oldIdmaterial, idmaterial);
    }

    /**
     * @return the existencia
     */
    public BigDecimal getExistencia() {
        return existencia;
    }

    /**
     * @param existencia the existencia to set
     */
    public void setExistencia(BigDecimal existencia) {
        java.math.BigDecimal oldExistencia = this.existencia;
        this.existencia = existencia;
        propertyChangeSupport.firePropertyChange(PROP_EXISTENCIA, oldExistencia, existencia);
    }
    
    
    
}
