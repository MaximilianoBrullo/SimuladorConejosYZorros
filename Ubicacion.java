/**
 * Representa una posicion en una malla rectangular
 */
public class Ubicacion {

    private int fila;
    private int columna;

    /**
     * Representa una fila y una columna
     * @param fila la fila
     * @param columna la columna
     */
    public Ubicacion(int fila, int columna){
        this.fila = fila;
        this.columna = columna;
    }

    /**
     * Implementa la igualdad del contenido
     */
    public boolean equals(Object obj){
        if(obj instanceof Ubicacion){
            Ubicacion otro = (Ubicacion) obj;
            return fila == otro.getFila() && columna == otro.getColumna();
        }else{
            return false;
        }
    }
}
