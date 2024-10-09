/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_8_poo;

/**
 * La interfaz P8_instrumentoMusical define el contrato que deben seguir todas las clases 
 * que representen un instrumento musical. Las clases que implementen esta interfaz deberán
 * proporcionar implementaciones de los métodos para tocar, afinar y especificar el tipo de instrumento.
 * 
 * Esta interfaz está pensada para ser implementada por cualquier clase que represente
 * un instrumento musical, independientemente de su tipo.
 * 
 * @author poo03alu21
 */
public interface P8_instrumentoMusical {

    /**
     * Método que debe ser implementado para definir cómo se toca el instrumento musical.
     * Las clases que implementen este método pueden definir el comportamiento específico de
     * tocar el instrumento.
     */
    void tocar();

    /**
     * Método que debe ser implementado para devolver el tipo de instrumento musical.
     * Las clases que implementen este método deben devolver una cadena que indique el tipo específico
     * de instrumento (por ejemplo, "Guitarra", "Flauta", etc.).
     * 
     * @return Una cadena que representa el tipo de instrumento.
     */
    String tipoDeInstrumento();

    /**
     * Método que debe ser implementado para definir cómo se afina el instrumento musical.
     * Las clases que implementen este método pueden definir el proceso específico de afinar
     * el instrumento musical.
     */
    void afinar();
}
