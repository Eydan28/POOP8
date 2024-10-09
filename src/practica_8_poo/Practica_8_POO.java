/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica_8_poo;

/**
 * La clase Practica_8_POO contiene el método principal para ejecutar y probar diversas clases y métodos
 * relacionados con polígonos, instrumentos musicales y la interfaz de meses.
 * 
 * Esta clase demuestra la creación de instancias de diferentes tipos de polígonos, incluyendo triángulos 
 * y cuadriláteros, así como el uso de polimorfismo. También incluye ejemplos del uso de una flauta 
 * (como instrumento musical de viento) y la interacción con la interfaz {@link P8_Meses}.
 * 
 * @author lenovo
 */
public class Practica_8_POO {

    /**
     * El método principal que ejecuta la lógica de la práctica. Crea y prueba diferentes
     * objetos como polígonos, triángulos, cuadriláteros, una flauta y muestra el uso de constantes de meses.
     * 
     * @param args los argumentos de la línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        
        // Crear y mostrar un polígono genérico
        P8_Poligono poligono1 = new P8_Poligono();
        System.out.println(poligono1);
        
        System.out.println("");
        System.out.println("###### TRIANGULO ######");
        
        // Crear y mostrar un triángulo
        P8_Triangulo triangulo1 = new P8_Triangulo(60, 60, 60, 5, 5, 5, 5, 6);
        System.out.println(triangulo1);
        System.out.println("Area = " + triangulo1.area());
        System.out.println("Perimetro = " + triangulo1.perimetro());
        
        System.out.println("");
        
        // Crear y mostrar otro polígono y un triángulo usando polimorfismo
        P8_Poligono poligono2 = new P8_Poligono();
        System.out.println(poligono2);
        
        P8_Triangulo triangulo2 = new P8_Triangulo();
        System.out.println(triangulo2);
        
        poligono2 = triangulo2; // Uso de polimorfismo
        System.out.println(poligono2);
        
        System.out.println("");
        System.out.println("###### CUADRILATERO ######");
        
        // Crear y mostrar un cuadrilátero
        P8_Cuadrilatero cuadrilatero1 = new P8_Cuadrilatero(90, 90, 90, 4, 4, 4, 5);
        System.out.println(cuadrilatero1);
        System.out.println("Area = " + cuadrilatero1.area());
        System.out.println("Perimetro = " + cuadrilatero1.perimetro());
        
        System.out.println("");
        
        // Crear y mostrar otro cuadrilátero usando polimorfismo con Object
        P8_Cuadrilatero cuadrilatero2 = new P8_Cuadrilatero();
        System.out.println(cuadrilatero2);
        
        Object object1 = new Object();
        System.out.println(object1);
        
        object1 = cuadrilatero2; // Uso de polimorfismo
        System.out.println(object1);
        
        System.out.println("");
        System.out.println("###### IDENTIFICAR ######");
        
        // Identificar las figuras (uso de instanceof)
        identificarFiguras(poligono1);
        identificarFiguras(poligono2);
        // identificarFiguras(object1); // Comentado ya que no es compatible con Object
        
        System.out.println("");
        System.out.println("####### FLAUTA #######");
        
        // Crear y utilizar una flauta
        P8_Flauta flauta = new P8_Flauta();
        flauta.tocar();
        flauta.afinar();
        flauta.tipoDeInstrumento();
        
        System.out.println("");
        System.out.println("###### MESES ######");
        
        // Mostrar algunas constantes de la interfaz P8_Meses
        System.out.println(Math.PI); // Constante de la clase Math
        System.out.println(P8_Meses.UNO); // Constante de la interfaz P8_Meses
        System.out.println(P8_Meses.MESES[P8_Meses.TRES]); // Acceder a un mes específico
    }

    /**
     * Identifica la figura poligonal mediante el uso de la comprobación de tipo con {@code instanceof}.
     * Imprime si el objeto es una instancia de {@link P8_Triangulo} o {@link P8_Cuadrilatero}.
     * 
     * @param poligono El polígono a identificar.
     */
    public static void identificarFiguras(P8_Poligono poligono) {
        if (poligono instanceof P8_Triangulo) {
            System.out.println("Instancia del Triangulo");
        } else if (poligono instanceof P8_Cuadrilatero) {
            System.out.println("Instancia del Cuadrilatero");
        }
    }
}
