package starbucks;


/**
 * Card Number Screen Component
 */
public class CardNumber implements ITouchEventHandler, IDisplayComponent, IKeyPadObserver
{
    ITouchEventHandler nextHandler ;
    private CardInfo cardInfo;
    private int count = 0;
    private String enteredCardNumber = "" ;
    
    /**
     * Touch Event Ignored by Passcode
     * @param x Touch X
     * @param y Touch Y
     */
    
    public CardNumber()
    {
    	cardInfo = CardInfo.getInstance();
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
    
    
    /**
     * Display "Echo Feedback" on Pins enterred so far
     * @return Passcode String for Display
     */
    public String display() 
    {
        String value = "[" + enteredCardNumber + "]" ;

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
        if ( count < 10 )
        {
            enteredCardNumber += key ;
        } 
        
        if (count == 9)
        {
    		cardInfo.setCID(enteredCardNumber);
        }
    }



}
