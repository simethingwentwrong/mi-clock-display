
/**
 * Write a description of class clockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    // se guada la variable horas
    private  NumberDisplay horas;
   
    // se guarda la variable minutos
    private  NumberDisplay minutos;
    
    // se guarda la hora actual con 5 caracteres
    private String HoraActual;
    // añadimos para diferenciar AM de PM
       private String indicador;

    /**
     * Constructor que fijas tu los parametros
     */
    public ClockDisplay()
    {
       horas = new NumberDisplay (24);
       minutos = new NumberDisplay (60);
       
       updateDisplay();
      
    }
    
    /**
     * constructor que te fija todo en o
     */
    public ClockDisplay(int horas1, int minutos1)
    {
       horas = new NumberDisplay (24);
       minutos = new NumberDisplay (60);

       setTime (horas1, minutos1);
    }
    
    /**
     * 
     */
    private void updateDisplay()
    {
           
        if (horas.getValue()>=12)
        {
          indicador ="PM";
          int hora = horas.getValue() - 12;
            
        }
        else
        {
            indicador="AM";
            
        }
        HoraActual= horas.getDisplayValue() + ":" + minutos.getDisplayValue() + indicador;                        
        
    }
    
    /**
     * 
     */
    public void setTime(int hora, int minuto)
    {
        horas.setValue(hora);
        minutos.setValue(minuto);
        updateDisplay();
    }
    
    /**
     * 
     */
    public String getTime()
    {
        return HoraActual;
    }
    
    /**
     * 
     */
    public void timeTick()
    {
        minutos.increment();
        if(minutos.getValue() == 0) {
            horas.increment();
        }
        updateDisplay();
    }

}
