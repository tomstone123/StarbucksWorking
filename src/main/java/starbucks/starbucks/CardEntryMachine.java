package starbucks;


/**
 * Card Number Entry Machine - Context for State Pattern.
 */
public class CardEntryMachine implements ICardStateMachine, IKeyPadObserver, IAddCardSubject
{
    /**
     * Get name of current state for unit testing
     * @return Class Name of Current State
     */
    
    public String getCurrentState()
    {
        return state.getClass().getName() ;
    }
    
    // Card Domain Object
    private int cardCount=0 ;
    private String card;
    private IAddCardObserver auth ; // single observer 
    
    // Card machine states
    private NoCardDigits card0 ;
    private OneCardDigits card1 ;
    private TwoCardDigits card2 ;
    private ThreeCardDigits card3 ;
    private FourCardDigits card4 ;
    private FiveCardDigits card5 ;
    private SixCardDigits card6 ;
    private SevenCardDigits card7 ;
    private EightCardDigits card8 ;
    private NineCardDigits card9 ;

    // current state
    private ICardState state ;

    // Card captured so far
    private String d1, d2, d3, d4, d5, d6, d7, d8, d9 ;
    public String d1() { return d1 ; }
    public String d2() { return d2 ; }
    public String d3() { return d3 ; }
    public String d4() { return d4 ; }
    public String d5() { return d5 ; }
    public String d6() { return d6 ; }
    public String d7() { return d7 ; }
    public String d8() { return d8 ; }
    public String d9() { return d9 ; }
    
    

    /**
     * Constructor for objects of class CardEntryMachine
     */
    public CardEntryMachine()
    {
        card0 = new NoCardDigits( this ) ;
        card1 = new OneCardDigits( this ) ;
        card2 = new TwoCardDigits( this ) ;
        card3 = new ThreeCardDigits( this ) ;
        card4 = new FourCardDigits( this ) ;
        card5 = new FiveCardDigits( this ) ;
        card6 = new SixCardDigits( this ) ;
        card7 = new SevenCardDigits( this ) ;
        card8 = new EightCardDigits( this ) ;
        card9 = new NineCardDigits( this ) ;
        this.d1 = "" ;
        this.d2 = "" ;
        this.d3 = "" ;
        this.d4 = "" ;
        this.d5 = "" ;
        this.d6 = "" ;
        this.d7 = "" ;
        this.d8 = "" ;
        this.d9 = "" ;
        this.state = card0 ;
      
    }
    
    /** Backspace Event */
    public void backspace() {
        this.state.backspace() ;
    }

    /**
     * Number Event
     * @param digit Digit Pressed
     */
    public void number( String digit ) {
        this.state.number( digit ) ;
    }

    /** Valid Card Event */
    public void validCard() {
        this.state.validCard() ;
    }

    /** Invalid Card Event */
    public void invalidCard() {
        this.state.invalidCard() ;
    }

    /** Change the State to No Card State */
    public void setStateNoCardDigits()
    {
        this.cardCount = 0 ;
        this.state = card0 ;
        this.d1 = "" ;
        this.d2 = "" ;
        this.d3 = "" ;
        this.d4 = "" ;
        this.d5 = "" ;
        this.d6 = "" ;
        this.d7 = "" ;
        this.d8 = "" ;
        this.d9 = "" ;
        debug() ;
    }
    
    /**
     * Change the State to One Card State
     * @param digit Digit/Number Enterred
     */
    public void setStateOneCardDigit( String digit )
    {
        this.cardCount = 1 ;
        this.state = card1 ;
        if ( digit != null )
            this.d1 = digit ;
        else {
            this.d2 = "" ;
            this.d3 = "" ;
            this.d4 = "" ;
            this.d5 = "" ;
            this.d6 = "" ;
            this.d7 = "" ;
            this.d8 = "" ;
            this.d9 = "" ;    
        }
        debug() ;
    }

    /**
     * Change the State to Two Card State
     * @param digit Digit/Number Enterred
     */
    public void setStateTwoCardDigits( String digit )
    {
        this.cardCount = 2 ;
        this.state = card2 ;
        if ( digit != null )
            this.d2 = digit ;
        else {
            this.d3 = "" ;
            this.d4 = "" ;
            this.d5 = "" ;
            this.d6 = "" ;
            this.d7 = "" ;
            this.d8 = "" ;
            this.d9 = "" ; 
        }
        debug() ;
    }

    /**
     * Change the State to Three Card State
     * @param digit Digit/Number Enterred
     */
    public void setStateThreeCardDigits( String digit )
    {
        this.cardCount = 3 ;
        this.state = card3 ;
        if ( digit != null )
            this.d3 = digit ;
        else {
            this.d4 = "" ;
            this.d5 = "" ;
            this.d6 = "" ;
            this.d7 = "" ;
            this.d8 = "" ;
            this.d9 = "" ; 
        }
        debug() ;
    }
    
    /**
     * Change the State to Four Card State
     * @param digit Digit/Number Enterred
     */
    public void setStateFourCardDigits( String digit )
    {
        this.cardCount = 4 ;
        this.state = card4 ;
        if ( digit != null )
            this.d4 = digit ;
        else {
            this.d5 = "" ;
            this.d6 = "" ;
            this.d7 = "" ;
            this.d8 = "" ;
            this.d9 = "" ; 
        }
        debug() ;
    }
    
    /**
     * Change the State to Five Card State
     * @param digit Digit/Number Enterred
     */
    public void setStateFiveCardDigits( String digit )
    {
        this.cardCount = 5 ;
        this.state = card5 ;
        if ( digit != null )
            this.d5 = digit ;
        else {
            this.d6 = "" ;
            this.d7 = "" ;
            this.d8 = "" ;
            this.d9 = "" ; 
        }
        debug() ;
    }
    
    /**
     * Change the State to Six Card State
     * @param digit Digit/Number Enterred
     */
    public void setStateSixCardDigits( String digit )
    {
        this.cardCount = 6 ;
        this.state = card6 ;
        if ( digit != null )
            this.d6 = digit ;
        else {
            this.d7 = "" ;
            this.d8 = "" ;
            this.d9 = "" ; 
        }
        debug() ;
    }
    
    /**
     * Change the State to Seven Card State
     * @param digit Digit/Number Enterred
     */
    public void setStateSevenCardDigits( String digit )
    {
        this.cardCount = 7 ;
        this.state = card7 ;
        if ( digit != null )
            this.d7 = digit ;
        else {
            this.d8 = "" ;
            this.d9 = "" ; 
        }
        debug() ;
    }
    
    /**
     * Change the State to Seven Card State
     * @param digit Digit/Number Enterred
     */
    public void setStateEightCardDigits( String digit )
    {
        this.cardCount = 8 ;
        this.state = card8 ;
        if ( digit != null )
            this.d8 = digit ;
        else {
            this.d9 = "" ;
        }
        debug() ;
    }
    
    /**
     * Change the State to Nine Card State
     * @param digit Digit/Number Enterred
     */
    public void setStateNineCardDigits( String digit )
    {
        this.cardCount = 9 ;
        this.state = card9 ;
        if ( digit != null )
        {
            this.d9 = digit ;
            card = d1+d2+d3+d4+d5+d6+d7+d8+d9;
            debug() ;
            System.err.println( "Authenticating..." ) ;
            if ( card == card )
            {
                System.err.println( "Card Number Entered!" ) ;
                notifyObserver() ;
            }
            else
            {
                System.err.println( "Login Failed!" ) ;
                setStateNoCardDigits() ;
            }
        }
    }
    
    /**
     * Observer of Key Events
     * @param c   Num Keys So Far
     * @param key Last Key Enterred
     */
    public void keyEventUpdate( int c, String key ) 
    {
        System.err.println( "Key: " + key + " Count: " + c ) ;
        if ( key.equals(" ") )
        /* nothing */ ;
        else if ( key.equals("X") )
            backspace() ;
        else
            number( key ) ;        
    }    

    /**
     * Register Observers for Pin Authentication
     * @param obj Object Observing Pin Auth
     */
    public void registerObserver( IAddCardObserver obj ) 
    {
        this.auth = obj ;
    }

    /**
     * Remove Card Auth Observer
     * @param obj Object No Longer Observing Pin Auth
     */
    public void removeObserver( IAddCardObserver obj ) 
    {
        this.auth = null ;
    }

    /**
     * Notify Pin Auth Observers
     */
    public void notifyObserver( ) 
    {
        if ( this.auth != null )
            this.auth.correctCardNumber() ;
    }

    
    /** Debug Dump to Stderr State Machine Changes */
    private void debug()
    {
        System.err.println( "Current State: " + state.getClass().getName() ) ;
        System.err.println( "D1 = " + d1 ) ;
        System.err.println( "D2 = " + d2 ) ;
        System.err.println( "D3 = " + d3 ) ;
        System.err.println( "D4 = " + d4 ) ;
        System.err.println( "D5 = " + d5 ) ;
        System.err.println( "D6 = " + d6 ) ;
        System.err.println( "D7 = " + d7 ) ;
        System.err.println( "D8 = " + d8 ) ;
        System.err.println( "D9 = " + d9 ) ;
    }

}
