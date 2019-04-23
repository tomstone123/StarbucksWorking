

package starbucks ;

/** Four Card Digit State */
public class FourCardDigits implements ICardState
{
    ICardStateMachine machine ;

    /**
     * Constructor
     * @param  m Reference to State Machine
     */
    public FourCardDigits( ICardStateMachine m )
    {
        this.machine = m ;
    }

    /** Backspace Event */
    public void backspace() {
        machine.setStateThreeCardDigits( null ) ;
    }

    /**
     * Number Event
     * @param digit Digit pressed
     */
    public void number( String digit ) {
        machine.setStateFiveCardDigits( digit ) ;
    }

    /** Valid Card Event */
    public void validCard() {

    }

    /** Invlid Card Event */
    public void invalidCard() {

    }

}
