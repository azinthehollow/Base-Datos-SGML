package utils;

/**
 * Utilidades para Strings
 * @author Alejandro Escobedo
 */
public class StringUtils {
    
    /**
     * Metodo para capitalizar cualquier palabra
     * @param line
     * @return 
     */
      public static String capitalize(final String line) {
        return Character.toUpperCase(line.charAt(0)) + line.substring(1);
    }

    
}
