import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.awt.Color;

/*
 * Un modelo simple de simulacion predador-presa
 * con zorros y conejos dentro de un campo cerrado.
 */
public class Simulador{
    //Se definen las constantes que representan la
    //informacion de confiiguracion por defecto
    private static final int ANCHO_POR_DEFECTO = 50;
    private static final int ALTO_POR_DEFECTO = 50;
    private static final double PROBABILIDAD_DE_CRACION_DE_ZORRO = 0.02;
    private static final double PROBABILIDAD_DE_CREACION_DE_CONEJO = 0.08;

    private List<Animal> animales;
    private List<Animal> animalesNuevos;
    private Campo campo;
    private Campo campoActualizado;
    
    private int paso;
    private VisorDelSimulador visor;

    public Simulador(){
        this(Largo_POR_DEFECTO, ANCHO_POR_DEFECTO);
    }

    public Simulador(int largo, int ancho){
        if(ancho <= 0 || largo  <= 0){
            System.out.println("Las dimenciones deben ser mayores a 0.");
            System.out.print("Uso de valores por defecto.");
            largo = Largo_POR_DEFECTO;
            ancho = ANCHO_POR_DEFECTO;
        }
        animales = new ArrayList<Animal>();
        animalesNuevos = new ArrayList<Animal>();
        campo = new Campo(largo, ancho);
        campoActualizado = new campo (largo, ancho);
    }