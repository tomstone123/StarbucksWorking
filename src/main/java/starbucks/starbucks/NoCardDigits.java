package starbucks;


/**
 * No Card State
 */
public class NoCardDigits implements ICardState
{
    ICardStateMachine machine ;

    /**
     * Constructor
     * @param  m Reference to State Machine
     */
    public NoCardDigits( ICardStateMachine m )
    {
        this.machine = m ;
    }

    /** Backspace Event */
    public void backspace() {
    }

    /**
     * Number Event
     * @param digit Digit pressed
     */
    public void number( String digit ) {
        machine.setStateOneCardDigit( digit ) ;
    }

    /** Valid Card Event */
    public void validCard() {
    }

    /** Invalid Card Event */
    public void invalidCard() {
    }
}
