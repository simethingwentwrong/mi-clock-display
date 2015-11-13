
/**
 * Write a description of class meclockdisplay here.
 *la clase NumberDisplay realizando los commits que creas oportunos. A continuación se indica qué es necesario que, como mínimo, implemente dicha clase:

Un constructor que recibe por parámetro el límite del display y que fija el valor actual del display a 0.
Un método setter que fija el valor actual del display al valor pasado como parámetro (nombre del método: setValue).
Un método que devuelve el valor actual del display en forma de cadena de 2 caracteres (nombre del método: getDisplayValue).
Un método que devuelve el valor actual del display como entero (nombre del método: getValue),
Un método que incrementa en 1 al display y lo hace volver al principio si alcanza el límite (nombre del método: increment)
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumberDisplay
{
    // instance variables - replace the example below with your own
    private int limitNumber;
    
    private int display1;
    
    private int display;

    /**
     * Constructor for objects of class meclockdisplay
     */
    public NumberDisplay(int limitNUmber, int display2)
    {
        // initialise instance variables
        display = 0;
        dispalay1 = display2;
    }
    

    /**
     * fija el valor actual de display al valor pasado como parametro
     */
    public void setValue ()
    {
    }
        
}