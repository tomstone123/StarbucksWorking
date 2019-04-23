
package starbucks ;

/** To Card Digits State */
public class TwoCardDigits implements ICardState
{
    ICardStateMachine machine ;


    /**
     * Constructor
     * @param  m Reference to State Machine
     */    
    public TwoCardDigits( ICardStateMachine m )
    {
        this.machine = m ;
    }

    /** Backspace Event */
    public void backspace() {
        machine.setStateOneCardDigit( null );
    }

    /**
     * Number Event
     * @param digit Digit pressed
     */
    public void number( String digit ) {
        machine.setStateThreeCardDigits( digit ) ;
    }

    /** Valid Card Event */
    public void validCard() {

    }

    /** Invalid Card Event */
    public void invalidCard() {

    }

}
