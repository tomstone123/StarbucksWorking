

package starbucks;

/** Settings Screen */
public class Settings extends Screen
{
    private AddCard addcard ;
    private IFrame frame ;
    
    private KeyPad kp;
    
    public Settings(){
        
        kp = new KeyPad() ;
        
        addcard = new AddCard() ;
        addcard.addSubComponent( kp ) ;
        
        frame = new Frame( addcard);
        
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
                System.out.println( "Add Card Reached3" ) ;
                frame.setCurrentScreen( addcard ) ;
                frame.display();
                //frame.screen();
                //frame.contents();
                System.out.println( "Add Card Reached4" ) ;
            }
        }
        
    }
}
