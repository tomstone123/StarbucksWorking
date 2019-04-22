
package starbucks;

/**
 * Add New Card Screen
 */
public class AddCard extends Screen
{
    
    private KeyPad kp;
    private PinScreen ps ;
    
    
    public AddCard()
    {
        System.err.println( "Add Card Reached1" ) ;
        kp = new KeyPad() ;
        ps = new PinScreen() ;
        
        ps.addSubComponent( kp ) ;
    }
    
    /**
     * 
     * 
     */
    public String display() 
    {
        System.err.println( "Add Card Reached2" ) ;
        String output =  " Add Card Screen\n" ;
         
        
        //return " [1] [2] [3]\n [4] [5] [6]\n [7] [8] [9]\n [_] [0] [X]"  ;
        /*
               output =  " [1] [2] [3]\n" ;
               output += " [4] [5] [6]\n" ;
               output += " [7] [8] [9]\n" ;
               output += " [_] [0] [x]" ;
        */
        
        System.out.println( screenContents() ) ;       

        return output ;
    }
    
    public String screenContents() {
       
            String out = "" ;
            out = "----------------\n" ;
            out += "   " + ps.name() + "  \n" ;
            out += "----------------\n\n\n" ;
            out += ps.display() ;
            out += "\n\n\n----------------\n" ;
            return out ;
        
    }
}
