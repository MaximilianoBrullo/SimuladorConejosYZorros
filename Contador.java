import java.awt.Color;
/**
 * Esta clase provee un contador para cada participante
 * de la simulacion. Esto incluye un texto indicador y
 * la cantidad de participantes de este tipo que existen
 * en cada momento de la simulacion.
 */
public class Contador {
    private String nombre;
    private int cantidad;

    /**
     * Provee un nombre para uno de los tipos
     * de simulacion
     * @param nombre
     */
    public Contador(String nombre){
        this.nombre = nombre;
        cantidad = 0;
    }

    /**
     * @return Descripcion corta del tipo
     */
    public String getNombre(){
        return nombre;
    }
    /**
     * @return La cantidad actual del tipo
     */
    public int getCantidad(){
        return cantidad;
    }
    /**
     * Incrementa la cantidad en uno
     */
    public void incrementarCantidad(){
        cantidad++;
    }
    /**
     * Reiniciar la cantidad a cero
     */
    public void reiniciar(){
        cantidad = 0;
    }
}
