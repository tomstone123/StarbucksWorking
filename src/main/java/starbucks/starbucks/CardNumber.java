package starbucks;


/**
 * Card Number Screen Component
 */
public class CardNumber implements ITouchEventHandler, IDisplayComponent, IKeyPadObserver
{
    ITouchEventHandler nextHandler ;
    private int count = 0;
    
    /**
     * Touch Event Ignored by Passcode
     * @param x Touch X
     * @param y Touch Y
     */
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
        String value = "" ;
        switch ( count )
        {
            case 0: value = "[]" ; break ;
            case 1: value = "[*]" ; break ;
            case 2: value = "[**]" ; break ;
            case 3: value = "[***]" ; break ;
            case 4: value = "[****]" ; break ;
            case 5: value = "[*****]" ; break ;
            case 6: value = "[******]" ; break ;
            case 7: value = "[*******]" ; break ;
            case 8: value = "[********]" ; break ;
            case 9: value = "[*********]" ; break ;
        }
        System.err.println( value );
        
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
    }



}
