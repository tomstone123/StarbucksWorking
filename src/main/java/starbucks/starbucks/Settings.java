

package starbucks;

/** Settings Screen */
public class Settings extends Screen
{
    private AddCard addcard ;
    private IFrame frame ;
    private IMenuCommand addcardnow ;
        
    private KeyPad kp;
    
    public Settings(IMenuCommand t){
        addcardnow = t ;
       
        addcard = new AddCard(null) ;
        //addcard.addSubComponent( kp ) ;
        

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
                addcardnow.execute();
                
            }
        }
        
    }
    
    /*
     * To be used in the future
     */
    public void settingOptions(IMenuCommand s) {
        addcardnow = s ;
    }
    
}
