package it.accaemme.exercises.MaxDiTre;

public class MaxDiTre {
    public static int max(int num1, int num2, int num3) {
      
  	  //if(num1==0 && num2==0 && num3==0) throw new ExceptionCheckInput("Strano");
      if(num1==0 && num2==0 && num3==0) throw new IllegalArgumentException("Check if input are corrects. Max of all zero is zero!");
  	  
	  if(num1 >= num2) {             
	     	  if(num1 >= num3)
  	                   return num1;
	     	  else
	                   return num3;
 	  }     else {   
	     	  if(num2 >= num3)
	                   return num2;
	     	  else 
                                 return num3;   
                }   
   }
    
   
    /*
    
    public class ExceptionNoTextInput extends Exception{
    	private static final long serialVersionUID = 1L;

    	public ExceptionNoTextInput(String msg){
    		super();
    		System.err.println(msg);
    	}
    }
    
    public int insertDigit(Object o) throws ExceptionNoTextInput {
        // Si consideri la situazione in cui il valore non viene attinto come intero mediante tipi nativi, bensì si necessita di doverlo gestire come oggetto
        try {
        	int intValue = Integer.parseInt(o.toString());
    		return intValue;
        }catch(NumberFormatException e) {
        	System.out.println("Puoi inserire solo cifre.");
        }
        return 0;
    }
    */
}
