/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_8_poo;

/**
 * La clase P8_instrumentoDeViento representa un instrumento musical de viento.
 * Implementa la interfaz {@link P8_instrumentoMusical} y proporciona implementaciones básicas
 * para los métodos definidos en la interfaz, como tocar, afinar, y determinar el tipo de instrumento.
 * 
 * Esta clase es una implementación genérica para instrumentos de viento y puede ser extendida para representar
 * instrumentos específicos de esta familia.
 * 
 * @author poo03alu21
 */
public class P8_instrumentoDeViento extends Object implements P8_instrumentoMusical {

    /**
     * Constructor por defecto.
     * Crea una nueva instancia de P8_instrumentoDeViento sin inicializar propiedades adicionales.
     */
    public P8_instrumentoDeViento() {
    }

    /**
     * Sobrescribe el método tocar de {@link P8_instrumentoMusical}.
     * Imprime un mensaje indicando que el instrumento de viento está siendo tocado.
     */
    @Override
    public void tocar() {
        System.out.println("Tocando instrumento musical");
    }

    /**
     * Sobrescribe el método tipoDeInstrumento de {@link P8_instrumentoMusical}.
     * Imprime un mensaje indicando que es un "Instrumento de Viento" y devuelve {@code null}.
     * Este método puede ser sobrescrito en subclases para devolver el nombre específico del instrumento.
     * 
     * @return {@code null}, ya que es una implementación genérica de un instrumento de viento.
     */
    @Override
    public String tipoDeInstrumento() {
        System.out.println("Instrumento de Viento");
        return null;
    }

    /**
     * Sobrescribe el método afinar de {@link P8_instrumentoMusical}.
     * Imprime un mensaje indicando que el instrumento de viento está siendo afinado.
     */
    @Override
    public void afinar() {
        System.out.println("Afinando instrumento de viento");
    }

    /**
     * Devuelve una representación en cadena de texto del instrumento de viento.
     * 
     * @return Una cadena representando el objeto instrumento de viento.
     */
    @Override
    public String toString() {
        return "instrumentoDeViento{" + '}';
    }
}
