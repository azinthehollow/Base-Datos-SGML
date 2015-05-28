package models;

import java.beans.PropertyChangeSupport;
import java.math.BigDecimal;

public class Usuario extends BaseModel{
    public static final String PROP_IDUSUARIO = "PROP_IDUSUARIO";
    public static final String PROP_NOMBRE = "PROP_NOMBRE";
    public static final String PROP_APATERNO = "PROP_APATERNO";
    public static final String PROP_AMATERNO = "PROP_AMATERNO";
    public static final String PROP_DIRECCION = "PROP_DIRECCION";
    public static final String PROP_TELEFONO = "PROP_TELEFONO";


    private BigDecimal idusuario;
    private String nombre;
    private String apaterno;
    private String amaterno;
    private String direccion;
    private String telefono;
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);

    /**
     * @return the idusuario
     */
    public BigDecimal getIdusuario() {
        return idusuario;
    }

    /**
     * @param idusuario the idusuario to set
     */
    public void setIdusuario(BigDecimal idusuario) {
        java.math.BigDecimal oldIdusuario = this.idusuario;
        this.idusuario = idusuario;
        propertyChangeSupport.firePropertyChange(PROP_IDUSUARIO, oldIdusuario, idusuario);
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
     * @return the apaterno
     */
    public String getApaterno() {
        return apaterno;
    }

    /**
     * @param apaterno the apaterno to set
     */
    public void setApaterno(String apaterno) {
        java.lang.String oldApaterno = this.apaterno;
        this.apaterno = apaterno;
        propertyChangeSupport.firePropertyChange(PROP_APATERNO, oldApaterno, apaterno);
    }

    /**
     * @return the amaterno
     */
    public String getAmaterno() {
        return amaterno;
    }

    /**
     * @param amaterno the amaterno to set
     */
    public void setAmaterno(String amaterno) {
        java.lang.String oldAmaterno = this.amaterno;
        this.amaterno = amaterno;
        propertyChangeSupport.firePropertyChange(PROP_AMATERNO, oldAmaterno, amaterno);
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        java.lang.String oldDireccion = this.direccion;
        this.direccion = direccion;
        propertyChangeSupport.firePropertyChange(PROP_DIRECCION, oldDireccion, direccion);
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        java.lang.String oldTelefono = this.telefono;
        this.telefono = telefono;
        propertyChangeSupport.firePropertyChange(PROP_TELEFONO, oldTelefono, telefono);
    }
    
    

}
