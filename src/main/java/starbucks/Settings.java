

 

/** Settings Screen */
public class Settings extends Screen
{
    private IScreen addcard ;
    private IFrame frame ;
    
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
               output += " About|Terms\n" ;
               output += " Help\n" ;

        return output ;
    }
    
    public void touch(int x, int y) {
        if ( y == 1)
        {
            if( x > 0 && x < 4 )
            {
                System.err.println( "Add Card Pressed" ) ;
                addcard = new AddCard() ;
                frame.setCurrentScreen( addcard ) ;
                frame.display();
            }
        }
        
    }
}
