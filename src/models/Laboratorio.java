package models;

import java.beans.PropertyChangeSupport;
import java.math.BigDecimal;

public class Laboratorio extends BaseModel{
    public static final String PROP_IDLABORATORIO = "PROP_IDLABORATORIO";
    public static final String PROP_NOMBRE = "PROP_NOMBRE";
    public static final String PROP_CLAVE = "PROP_CLAVE";
    public static final String PROP_IDENCARGADO = "PROP_IDENCARGADO";


    private BigDecimal idlaboratorio;
    private String nombre;
    private String clave;
    private BigDecimal idencargado;
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);

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
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        java.lang.String oldNombre = this.nombre;
        this.nombre = nombre;
        propertyChangeSupport.firePropertyChange(PROP_NOMBRE, oldNombre, nombre);
    }

    /**
     * @return the clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        java.lang.String oldClave = this.clave;
        this.clave = clave;
        propertyChangeSupport.firePropertyChange(PROP_CLAVE, oldClave, clave);
    }

    /**
     * @return the idencargado
     */
    public BigDecimal getIdencargado() {
        return idencargado;
    }

    /**
     * @param idencargado the idencargado to set
     */
    public void setIdencargado(BigDecimal idencargado) {
        java.math.BigDecimal oldIdencargado = this.idencargado;
        this.idencargado = idencargado;
        propertyChangeSupport.firePropertyChange(PROP_IDENCARGADO, oldIdencargado, idencargado);
    }
}
