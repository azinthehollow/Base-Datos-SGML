package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Ricardo Peña
 */
public class OracleUtils {
    
    private static final String url = "jdbc:oracle:thin:@localhost:1521:XE";
    //Cambiar el nombre y usuario por el del administrador de la base de datos
    private static final  String usuario ="azinthehollow";
    private static final String contrasena = "1337";
    private static Connection con;
    private static Statement st;
    private static String query = null;
    
    
    
    /**
     * Metodo que conecta a la base de datos con la aplicacion.
     * @return conexion a la base de datos para poder interactuar con ella
     */
    public static Connection getDBConexion(){
        try {
            con= DriverManager.getConnection(url,usuario,contrasena);
        } catch (SQLException ex) {
            con = null;
        }
        return con;
    }
}
