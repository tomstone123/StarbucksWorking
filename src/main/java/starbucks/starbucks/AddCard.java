
package starbucks;

import java.util.* ;

/**
 * Add New Card Screen
 */
public class AddCard extends Screen
{
    private KeyPad kp;
   
    
    public AddCard()
    {
        kp = new KeyPad() ;
        this.addSubComponent( kp ) ;

    }
    
    /**
     * 
     * 
     
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
             

        return output ;
    }    
*/
}
