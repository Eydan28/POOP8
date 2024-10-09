/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_8_poo;

/**
 * La clase P8_Poligono representa una estructura base para polígonos.
 * Proporciona métodos para calcular el área y el perímetro de un polígono, 
 * aunque en esta clase base dichos métodos retornan valores por defecto.
 * 
 * Esta clase está diseñada para ser extendida por clases más específicas que
 * representen diferentes tipos de polígonos.
 * 
 * @author poo03alu21
 */
public class P8_Poligono {

    /**
     * Constructor por defecto.
     * Crea una nueva instancia de P8_Poligono sin inicializar propiedades adicionales.
     */
    public P8_Poligono() {
    }
    
    /**
     * Calcula el área del polígono.
     * Este método debe ser sobrescrito por clases que hereden de P8_Poligono, ya que en esta clase base
     * siempre retorna 0.0.
     * 
     * @return El área del polígono, por defecto 0.0.
     */
    public float area() {
        return 0.0f;
    }
    
    /**
     * Calcula el perímetro del polígono.
     * Este método debe ser sobrescrito por clases que hereden de P8_Poligono, ya que en esta clase base
     * siempre retorna 0.0.
     * 
     * @return El perímetro del polígono, por defecto 0.0.
     */
    public float perimetro() {
        return 0.0f;
    }

    /**
     * Devuelve una representación en cadena de texto del polígono.
     * En esta implementación básica, solo indica que se trata de un objeto de tipo Polígono.
     * 
     * @return Una cadena representando el objeto polígono.
     */
    @Override
    public String toString() {
        return "Poligono{" + '}';
    }
}
