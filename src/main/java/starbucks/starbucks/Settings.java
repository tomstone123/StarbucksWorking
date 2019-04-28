

package starbucks;

/** Settings Screen */
public class Settings extends Screen
{

    private IMenuCommand addcardnow ;
    
    public Settings(IMenuCommand t){
        addcardnow = t ;
       
        new AddCard(null, null);        

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
    
    /**
     * Switch to the Add Card Screen
     */
    public void touch(int x, int y) {
        if ( y == 1)
        {
            if( x > 0 && x < 4 )
            {
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
