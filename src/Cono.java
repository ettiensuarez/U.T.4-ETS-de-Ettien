/**
 * Clase que representa un Cono geométrico.
 * * @author Ettien Suárez Ramírez
 * @version 1.0
 */
public class Cono {

    // Atributos privadoss
    private float radioBase;
    private float altura;

    /**
     * Constructor que recibe todos los parámetros para crear el cono.
     * * @param radioBase El radio de la base del cono
     * @param altura La altura del cono
     */
    public Cono(float radioBase, float altura) {
        this.radioBase = radioBase;
        this.altura = altura;
    }

    /**
     * Obtiene el radio de la base.
     * @return el radio de la base
     */
    public float getRadioBase() {
        return radioBase;
    }

    /**
     * Establece un nuevo radio de la base.
     * @param radioBase el nuevo radio
     */
    public void setRadioBase(float radioBase) {
        this.radioBase = radioBase;
    }

    /**
     * Obtiene la altura del cono.
     * @return la altura del cono
     */
    public float getAltura() {
        return altura;
    }

    /**
     * Establece una nueva altura.
     * @param altura la nueva altura
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
     * Calcula el área de la base del cono (pi * r^2).
     * * @return El área de la base en formato float.
     */
    public float calcularAreaBase() {
        return (float) (Math.PI * (this.radioBase * this.radioBase));
    }

    /**
     * Calcula el volumen del cono ((AreaBase * altura) / 3).
     * * @return El volumen del cono en formato float.
     */
    public float calcularVolumen() {
        return (calcularAreaBase() * this.altura) / 3;
    }
}