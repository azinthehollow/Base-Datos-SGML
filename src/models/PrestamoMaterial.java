package models;

import java.beans.PropertyChangeSupport;
import java.math.BigDecimal;

public class PrestamoMaterial extends BaseModel{
    public static final String PROP_IDPRESTAMO = "PROP_IDPRESTAMO";
    public static final String PROP_IDMATERIAL = "PROP_IDMATERIAL";
    public static final String PROP_IDLABORATORIO = "PROP_IDLABORATORIO";


    private BigDecimal idprestamo;
    private BigDecimal idmaterial;
    private BigDecimal idlaboratorio;
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);

    /**
     * @return the idprestamo
     */
    public BigDecimal getIdprestamo() {
        return idprestamo;
    }

    /**
     * @param idprestamo the idprestamo to set
     */
    public void setIdprestamo(BigDecimal idprestamo) {
        java.math.BigDecimal oldIdprestamo = this.idprestamo;
        this.idprestamo = idprestamo;
        propertyChangeSupport.firePropertyChange(PROP_IDPRESTAMO, oldIdprestamo, idprestamo);
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

}
