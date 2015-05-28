package models;

import java.beans.PropertyChangeSupport;
import java.math.BigDecimal;

public class Material extends BaseModel{
    public static final String PROP_IDMATERIAL = "PROP_IDMATERIAL";
    public static final String PROP_DESCRIPCION = "PROP_DESCRIPCION";

    private BigDecimal idmaterial;
    private String descripcion;
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);

    public Material() {
    }

    public Material(BigDecimal idmaterial, String descripcion) {
        this.idmaterial = idmaterial;
        this.descripcion = descripcion;
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
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        java.lang.String oldDescripcion = this.descripcion;
        this.descripcion = descripcion;
        propertyChangeSupport.firePropertyChange(PROP_DESCRIPCION, oldDescripcion, descripcion);
    }

}
