/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_8_poo;

/**
 * La clase P8_Flauta representa una flauta, que es un tipo de instrumento de viento.
 * Hereda de la clase {@link P8_instrumentoDeViento} y sobrescribe sus métodos para
 * comportarse como una flauta.
 * 
 * @author poo03alu21
 */
public class P8_Flauta extends P8_instrumentoDeViento {

    /**
     * Constructor por defecto.
     * Crea una nueva instancia de P8_Flauta sin inicializar propiedades adicionales.
     */
    public P8_Flauta() {
    }
    
    /**
     * Sobrescribe el método tocar de {@link P8_instrumentoDeViento}.
     * Imprime un mensaje indicando que la flauta está siendo tocada.
     */
    @Override
    public void tocar() {
        System.out.println("Tocando flauta");
    }

    /**
     * Sobrescribe el método afinar de {@link P8_instrumentoDeViento}.
     * Imprime un mensaje indicando que la flauta está siendo afinada.
     */
    @Override
    public void afinar() {
        System.out.println("Afinando Flauta");
    }

    /**
     * Sobrescribe el método tipoDeInstrumento de {@link P8_instrumentoDeViento}.
     * Imprime y devuelve el tipo de instrumento, en este caso "Flauta".
     * 
     * @return Una cadena con el tipo de instrumento, "Flauta".
     */
    @Override
    public String tipoDeInstrumento() {
        System.out.println("Flauta");
        return "Flauta";
    }

    /**
     * Devuelve una representación en cadena de la flauta.
     * 
     * @return Una cadena representando el objeto flauta.
     */
    @Override
    public String toString() {
        return "Flauta{" + '}';
    }
    
}
