/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_8_poo;

/**
 * La clase P8_Cuadrilatero representa un cuadrilátero con sus ángulos y lados correspondientes.
 * Hereda de la clase {@link P8_Poligono}.
 * 
 * Esta clase permite calcular el área y el perímetro del cuadrilátero, así como almacenar 
 * sus propiedades geométricas (ángulos, lados, base y altura).
 * 
 * @author poo03alu21
 */
public class P8_Cuadrilatero extends P8_Poligono {
    private int alfa, beta, gamma;  // Ángulos en grados del cuadrilátero
    private float a, b;  // Lados del cuadrilátero
    private float base, altura;  // Base y altura del cuadrilátero

    /**
     * Constructor por defecto.
     * Crea un objeto P8_Cuadrilatero sin inicializar sus propiedades.
     */
    public P8_Cuadrilatero() {
    }

    /**
     * Constructor con parámetros.
     * Permite inicializar todas las propiedades del cuadrilátero.
     * 
     * @param alfa Ángulo alfa en grados.
     * @param beta Ángulo beta en grados.
     * @param gamma Ángulo gamma en grados.
     * @param a Lado a del cuadrilátero.
     * @param b Lado b del cuadrilátero.
     * @param base Base del cuadrilátero.
     * @param altura Altura del cuadrilátero.
     */
    public P8_Cuadrilatero(int alfa, int beta, int gamma, float a, float b, float base, float altura) {
        this.alfa = alfa;
        this.beta = beta;
        this.gamma = gamma;
        this.a = a;
        this.b = b;
        this.base = base;
        this.altura = altura;
    }

    /**
     * Obtiene el valor del ángulo alfa.
     * 
     * @return Ángulo alfa en grados.
     */
    public int getAlfa() {
        return alfa;
    }

    /**
     * Obtiene el valor del ángulo beta.
     * 
     * @return Ángulo beta en grados.
     */
    public int getBeta() {
        return beta;
    }

    /**
     * Obtiene el valor del ángulo gamma.
     * 
     * @return Ángulo gamma en grados.
     */
    public int getGamma() {
        return gamma;
    }

    /**
     * Obtiene el valor del lado a.
     * 
     * @return Longitud del lado a.
     */
    public float getA() {
        return a;
    }

    /**
     * Obtiene el valor del lado b.
     * 
     * @return Longitud del lado b.
     */
    public float getB() {
        return b;
    }

    /**
     * Obtiene la base del cuadrilátero.
     * 
     * @return Longitud de la base.
     */
    public float getBase() {
        return base;
    }

    /**
     * Obtiene la altura del cuadrilátero.
     * 
     * @return Altura del cuadrilátero.
     */
    public float getAltura() {
        return altura;
    }

    /**
     * Establece el valor del ángulo alfa.
     * 
     * @param alfa Ángulo alfa en grados.
     */
    public void setAlfa(int alfa) {
        this.alfa = alfa;
    }

    /**
     * Establece el valor del ángulo beta.
     * 
     * @param beta Ángulo beta en grados.
     */
    public void setBeta(int beta) {
        this.beta = beta;
    }

    /**
     * Establece el valor del ángulo gamma.
     * 
     * @param gamma Ángulo gamma en grados.
     */
    public void setGamma(int gamma) {
        this.gamma = gamma;
    }

    /**
     * Establece la longitud del lado a.
     * 
     * @param a Longitud del lado a.
     */
    public void setA(float a) {
        this.a = a;
    }

    /**
     * Establece la longitud del lado b.
     * 
     * @param b Longitud del lado b.
     */
    public void setB(float b) {
        this.b = b;
    }

    /**
     * Establece la base del cuadrilátero.
     * 
     * @param base Longitud de la base.
     */
    public void setBase(float base) {
        this.base = base;
    }

    /**
     * Establece la altura del cuadrilátero.
     * 
     * @param altura Altura del cuadrilátero.
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
     * Calcula el área del cuadrilátero.
     * 
     * @return El área del cuadrilátero (base * altura).
     */
    @Override
    public float area() {
        return base * altura;
    }

    /**
     * Calcula el perímetro del cuadrilátero.
     * 
     * @return El perímetro del cuadrilátero (a + b).
     */
    @Override
    public float perimetro() {
        return a + b;
    }

    /**
     * Devuelve una representación en cadena de texto del cuadrilátero,
     * incluyendo los valores de sus ángulos, lados, base y altura.
     * 
     * @return Una cadena con las propiedades del cuadrilátero.
     */
    @Override
    public String toString() {
        return "Cuadrilatero{" + "alfa=" + alfa + ", beta=" + beta + ", gamma=" + gamma + ", a=" + a + ", b=" + b + ", base=" + base + ", altura=" + altura + '}';
    }
}

