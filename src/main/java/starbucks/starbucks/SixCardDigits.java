

package starbucks ;

/** Six Card Digit State */
public class SixCardDigits implements ICardState
{
    ICardStateMachine machine ;

    /**
     * Constructor
     * @param  m Reference to State Machine
     */
    public SixCardDigits( ICardStateMachine m )
    {
        this.machine = m ;
    }

    /** Backspace Event */
    public void backspace() {
        machine.setStateFourCardDigits( null ) ;
    }

    /**
     * Number Event
     * @param digit Digit pressed
     */
    public void number( String digit ) {
        machine.setStateSevenCardDigits( digit ) ;
    }

    /** Valid Card Event */
    public void validCard() {

    }

    /** Invlid Card Event */
    public void invalidCard() {

    }

}
