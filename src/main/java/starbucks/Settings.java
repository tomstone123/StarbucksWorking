

package starbucks;

/** Settings Screen */
public class Settings extends Screen
{
    
    public Settings(){

    }

    
    
    /**
     * Pint out Settings Menu
     * @return Key Pad View Contents
     */
    public String display() 
    {
        
        String output =  " Add Card\n" ;
               output += " Delete Card\n" ;
               output += " Billing Info\n" ;
               output += " Passcode\n" ;
               output += " \n" ;
               output += " About\n" ;
               output += " TOC\n" ;
               output += " Help\n" ;

        return output ;
    }
}
