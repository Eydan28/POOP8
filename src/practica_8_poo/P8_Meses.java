/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_8_poo;

/**
 * La interfaz P8_Meses define constantes relacionadas con los meses del año.
 * Contiene los números del 1 al 12 que representan los meses y un arreglo de cadenas con los nombres de los meses.
 * 
 * Los meses están organizados en el arreglo {@code MESES}, donde el índice 1 es "Enero" y el índice 12 es "Diciembre".
 * El índice 0 corresponde a una cadena vacía.
 * 
 * @author poo03alu21
 */
public interface P8_Meses {
    
    /** Constante para el primer mes (Enero). */
    int UNO = 1;
    
    /** Constante para el segundo mes (Febrero). */
    int DOS = 2;
    
    /** Constante para el tercer mes (Marzo). */
    int TRES = 3;
    
    /** Constante para el cuarto mes (Abril). */
    int CUATRO = 4;
    
    /** Constante para el quinto mes (Mayo). */
    int CINCO = 5;
    
    /** Constante para el sexto mes (Junio). */
    int SEIS = 6;
    
    /** Constante para el séptimo mes (Julio). */
    int SIETE = 7;
    
    /** Constante para el octavo mes (Agosto). */
    int OCHO = 8;
    
    /** Constante para el noveno mes (Septiembre). */
    int NUEVE = 9;
    
    /** Constante para el décimo mes (Octubre). */
    int DIEZ = 10;
    
    /** Constante para el undécimo mes (Noviembre). */
    int ONCE = 11;
    
    /** Constante para el duodécimo mes (Diciembre). */
    int DOCE = 12;

    /** Arreglo de cadenas que contiene los nombres de los meses, comenzando desde una cadena vacía en la posición 0. */
    String[] MESES = {"cadena vacia", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
}
