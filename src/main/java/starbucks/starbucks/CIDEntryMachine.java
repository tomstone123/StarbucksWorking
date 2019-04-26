package starbucks;


/**
 *CID Entry Machine
 */
public class CIDEntryMachine implements ICIDStateMachine, IKeyPadObserver, IAddCardSubject
{
/**
     * Get name of current state for unit testing
     * @return Class Name of Current State
     */
    
    public String getCurrentState()
    {
        return state.getClass().getName() ;
    }
    
    // CID Domain Object
    private int cidCount=0 ;
    private String cid;
    private IAddCardObserver auth ; // single observer 
    
    // CID machine states
    private NoCIDDigits cid0 ;
    private OneCIDDigits cid1 ;
    private TwoCIDDigits cid2 ;
    private ThreeCIDDigits cid3 ;

    // current state
    private ICIDState state ;

    // CID captured so far
    private String d1, d2, d3;
    public String d1() { return d1 ; }
    public String d2() { return d2 ; }
    public String d3() { return d3 ; }

    /**
     * Constructor for objects of class CIDEntryMachine
     */
    public CIDEntryMachine()
    {
        cid0 = new NoCIDDigits( this ) ;
        cid1 = new OneCIDDigits( this ) ;
        cid2 = new TwoCIDDigits( this ) ;
        cid3 = new ThreeCIDDigits( this ) ;

        this.d1 = "" ;
        this.d2 = "" ;
        this.d3 = "" ;
        this.state = cid0 ;
      
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

    /** Valid CID Event */
    public void validCID() {
        this.state.validCID() ;
    }

    /** Invalid CID Event */
    public void invalidCID() {
        this.state.invalidCID() ;
    }

    /** Change the State to No CID State */
    public void setStateNoCIDDigits()
    {
        this.cidCount = 0 ;
        this.state = cid0 ;
        this.d1 = "" ;
        this.d2 = "" ;
        this.d3 = "" ;
        debug() ;
    }
    
    /**
     * Change the State to One CID State
     * @param digit Digit/Number Enterred
     */
    public void setStateOneCIDDigit( String digit )
    {
        this.cidCount = 1 ;
        this.state = cid1 ;
        if ( digit != null )
            this.d1 = digit ;
        else {
            this.d2 = "" ;
            this.d3 = "" ;
        }
        debug() ;
    }

    /**
     * Change the State to Two CID State
     * @param digit Digit/Number Enterred
     */
    public void setStateTwoCIDDigits( String digit )
    {
        this.cidCount = 2 ;
        this.state = cid2 ;
        if ( digit != null )
            this.d2 = digit ;
        else {
            this.d3 = "" ;
        }
        debug() ;
    }

    /**
     * Change the State to Nine CID State
     * @param digit Digit/Number Enterred
     */
    public void setStateThreeCIDDigits( String digit )
    {
        this.cidCount = 3 ;
        this.state = cid3 ;
        if ( digit != null )
        {
            this.d3 = digit ;
            cid = d1+d2+d3;
            debug() ;
            System.err.println( "Authenticating..." ) ;
            if ( cid == cid )
            {
                System.err.println( "CID Number Entered!" ) ;
                notifyObserver() ;
            }
            else
            {
                System.err.println( "Login Failed!" ) ;
                setStateNoCIDDigits() ;
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
     * Remove CID Auth Observer
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
    }

}
