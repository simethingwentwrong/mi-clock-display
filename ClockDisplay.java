
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
    // oolean 
    private boolean relojDe12Horas;
    
    // se guarda la hora actual con 5 caracteres
    private String horaActual;
    // añadimos para diferenciar AM de PM
       private String indicador;
    // añadimos la variable año
    private NumberDisplay ano;
    // añadimos la variable mes
    private NumberDisplay mes;
    // añadimos variable dia
    private NumberDisplay dia;
    

    /**
     * Constructor que fijas tu los parametros
     */
    public ClockDisplay()
    {
       horas = new NumberDisplay (24);
       minutos = new NumberDisplay (60);
       ano = new NumberDisplay(2015);
       mes = new NumberDisplay(12);
       dia = new NumberDisplay(31);
       dia.setValue(15);
       mes.setValue(11);
       ano.setValue(20);
       updateDisplay();
      
    }
    
    /**
     * constructor que te fija todo en o
     */
    public ClockDisplay(int horas1, int minutos1, int dias, int meses, int anos)
    {
       horas = new NumberDisplay (24);
       minutos = new NumberDisplay (60);
       dia = new NumberDisplay(2015);
       mes = new NumberDisplay(12);
       ano = new NumberDisplay(31);
       dia.setValue(anos);
       mes.setValue(meses);
       ano.setValue(dias);
     

       setTime (horas1, minutos1, dias, meses, anos);
    }
    
    /**
     * 
     */
    private void updateDisplay()
    {
           
        if (relojDe12Horas) {
	 		String formato = "a.m";
		    int horaAhora = horas.getValue(); 
		    if (horaAhora >= 12){
		        formato = "p.m.";
		    }

		    if (horaAhora > 12) {
		        horaAhora = horaAhora - 12;
		    }
		    else if (horaAhora == 0) {
		        horaAhora = 12;
		    }
		    horaActual = ano.getDisplayValue()+"/" + mes.getDisplayValue()+"/" + dia.getDisplayValue()+"//"+horaAhora + ":" + minutos.getDisplayValue() + " " + formato;
		}
		else {
			horaActual = ano.getDisplayValue()+"/" + mes.getDisplayValue()+"/" + dia.getDisplayValue()+"//"+horas.getDisplayValue() + ":" + minutos.getDisplayValue();     
		}
            
        }
                               
        
    
    
    /**
     * 
     */
    public void setTime(int hora, int minuto, int dia1, int mes1, int ano1)
    {
        horas.setValue(hora);
        minutos.setValue(minuto);       
        ano.setValue(ano1);
        mes.setValue(mes1);
        dia.setValue(dia1);
        updateDisplay();
    }
    
    /**
     * 
     */
    public String getTime()
    {
        return horaActual;
    }
    
    /**
     * 
     */
    public void timeTick()
    {
        minutos.increment();
        if(minutos.getValue() == 0) 
        {
            horas.increment();
        
                 if (horas.getValue() ==0)
                   {
                     dia.increment();
        
                           if (dia.getValue() ==0)
                             {
                                 mes.increment();
        
                                     if (mes.getValue() ==0)
                                     {
                   
                                       ano.increment();
                                    }
                              }
                   }
        }
         if (dia.getValue() ==0)
         {
           mes.increment();
        }
         if (mes.getValue() ==0)
         {             
          ano.increment();
        }
        updateDisplay();
    }
}
    


