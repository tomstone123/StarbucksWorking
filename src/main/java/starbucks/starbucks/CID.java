

package starbucks;

/** My Card Options Screen */
public class CID implements ITouchEventHandler, IDisplayComponent, IKeyPadObserver
{  
    ITouchEventHandler nextHandler ;
    private int count = 0;
    private String enteredCID = "" ;
    private CardInfo cardInfo;
    private double newCardValue = 20.00;
    
    /**
     * Touch Event Ignored by Passcode
     * @param x Touch X
     * @param y Touch Y
     */
    
    public CID()
    { 
        cardInfo = new CardInfo();
    }
    
    public void touch(int x, int y) 
    {
        if ( y < 5 )
        {
            System.err.println( "Keypad Touched at (" + x + ", " + y + ")" ) ; 
        }
        else
        {
            if ( nextHandler != null )
                nextHandler.touch(x,y) ;
        }
    }
    
    /**
     * Set Next Touch Handler
     * @param next Touch Event Handler
     */
    public void setNext( ITouchEventHandler next) 
    { 
        nextHandler = next ;
    }
    

    
    public String display() 
    {
        String value = "[" + enteredCID + "]" ;
      
        return value ;

    }
    
    /**
     * Add Sub Component (Not used)
     * @param c Sub Component to Add
     */
    public void addSubComponent( IDisplayComponent c ) 
    {
        
    }   
    
    /**
     * Key Event Update
     * @param c   Count of Keys So Far
     * @param key Last key Pressed
     */
    public void keyEventUpdate( int c, String key ) 
    {
        System.err.println( "Key: " + key ) ;
        count = c ;
        if ( count > 9 && count <= 12 )
        {
            enteredCID += key ;         

        }
        
        if (count == 12)
            {
            	cardInfo.setCashAmount(newCardValue);
            	System.err.println("updating new card cash value");
            }
    }

   
}