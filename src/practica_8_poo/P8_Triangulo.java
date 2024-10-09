/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_8_poo;

/**
 * La clase P8_Triangulo representa un triángulo, con sus ángulos y lados correspondientes.
 * Hereda de la clase {@link P8_Poligono} y permite calcular el área y el perímetro de un triángulo.
 * 
 * @author poo03alu21
 */
public class P8_Triangulo extends P8_Poligono {
    
    private int alfa, beta, gamma;  // Ángulos del triángulo en grados
    private float a, b, c;  // Lados del triángulo
    private float base, altura;  // Base y altura del triángulo

    /**
     * Constructor por defecto.
     * Crea una instancia de P8_Triangulo sin inicializar sus propiedades.
     */
    public P8_Triangulo() {
    }

    /**
     * Constructor con parámetros.
     * Permite inicializar todos los valores de ángulos, lados, base y altura del triángulo.
     * 
     * @param alfa Ángulo alfa en grados.
     * @param beta Ángulo beta en grados.
     * @param gamma Ángulo gamma en grados.
     * @param a Lado a del triángulo.
     * @param b Lado b del triángulo.
     * @param c Lado c del triángulo.
     * @param base Base del triángulo.
     * @param altura Altura del triángulo.
     */
    public P8_Triangulo(int alfa, int beta, int gamma, float a, float b, float c, float base, float altura) {
        this.alfa = alfa;
        this.beta = beta;
        this.gamma = gamma;
        this.a = a;
        this.b = b;
        this.c = c;
        this.base = base;
        this.altura = altura;
    }

    /**
     * Obtiene la longitud del lado a.
     * 
     * @return Longitud del lado a.
     */
    public float getA() {
        return a;
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
     * Obtiene la altura del triángulo.
     * 
     * @return Altura del triángulo.
     */
    public float getAltura() {
        return altura;
    }

    /**
     * Establece la altura del triángulo.
     * 
     * @param altura Altura del triángulo.
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
     * Obtiene la base del triángulo.
     * 
     * @return Base del triángulo.
     */
    public float getBase() {
        return base;
    }

    /**
     * Establece la base del triángulo.
     * 
     * @param base Base del triángulo.
     */
    public void setBase(float base) {
        this.base = base;
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
     * Establece el valor del ángulo alfa.
     * 
     * @param alfa Ángulo alfa en grados.
     */
    public void setAlfa(int alfa) {
        this.alfa = alfa;
    }

    /**
     * Obtiene la longitud del lado b.
     * 
     * @return Longitud del lado b.
     */
    public float getB() {
        return b;
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
     * Obtiene el valor del ángulo beta.
     * 
     * @return Ángulo beta en grados.
     */
    public int getBeta() {
        return beta;
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
     * Obtiene la longitud del lado c.
     * 
     * @return Longitud del lado c.
     */
    public float getC() {
        return c;
    }

    /**
     * Establece la longitud del lado c.
     * 
     * @param c Longitud del lado c.
     */
    public void setC(float c) {
        this.c = c;
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
     * Establece el valor del ángulo gamma.
     * 
     * @param gamma Ángulo gamma en grados.
     */
    public void setGamma(int gamma) {
        this.gamma = gamma;
    }
    
    /**
     * Calcula el área del triángulo.
     * 
     * @return El área del triángulo (base * altura) / 2.
     */
    @Override
    public float area() {
        return (base * altura) / 2;
    }
    
    /**
     * Calcula el perímetro del triángulo.
     * 
     * @return El perímetro del triángulo (a + b + c).
     */
    @Override
    public float perimetro() {
        return a + b + c;
    }

    /**
     * Devuelve una representación en cadena de texto del triángulo,
     * incluyendo los valores de sus ángulos, lados, base y altura.
     * 
     * @return Una cadena con las propiedades del triángulo.
     */
    @Override
    public String toString() {
        return "Triangulo{" + "alfa=" + alfa + ", beta=" + beta + ", gamma=" + gamma + ", a=" + a + ", b=" + b + ", c=" + c + ", base=" + base + ", altura=" + altura + '}';
    }
}
