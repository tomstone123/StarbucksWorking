

package starbucks ;

/** Seven Card Digit State */
public class SevenCardDigits implements ICardState
{
    ICardStateMachine machine ;

    /**
     * Constructor
     * @param  m Reference to State Machine
     */
    public SevenCardDigits( ICardStateMachine m )
    {
        this.machine = m ;
    }

    /** Backspace Event */
    public void backspace() {
        machine.setStateSixCardDigits( null ) ;
    }

    /**
     * Number Event
     * @param digit Digit pressed
     */
    public void number( String digit ) {
        machine.setStateEightCardDigits( digit ) ;
    }

    /** Valid Card Event */
    public void validCard() {

    }

    /** Invlid Card Event */
    public void invalidCard() {

    }

}
