package models;

import java.beans.PropertyChangeSupport;
import java.math.BigDecimal;
import java.sql.Timestamp;

public class Prestamo extends BaseModel{
    public static final String PROP_IDPRESTAMO = "PROP_IDPRESTAMO";
    public static final String PROP_DESCRIPCION = "PROP_DESCRIPCION";
    public static final String PROP_IDUSUARIO = "PROP_IDUSUARIO";
    public static final String PROP_FECHA = "PROP_FECHA";
    

    private BigDecimal idprestamo;
    private String descripcion;
    private BigDecimal idusuario;
    private Timestamp fecha;
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
     * @return the fecha
     */
    public Timestamp getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Timestamp fecha) {
        java.sql.Timestamp oldFecha = this.fecha;
        this.fecha = fecha;
        propertyChangeSupport.firePropertyChange(PROP_FECHA, oldFecha, fecha);
    }
  
}
