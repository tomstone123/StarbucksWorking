

package starbucks ;

/** One Pig Digit State */
public class OneCardDigits implements ICardState
{
    ICardStateMachine machine ;

    /**
     * Constructor
     * @param  m Reference to State Machine
     */
    public OneCardDigits( ICardStateMachine m )
    {
        this.machine = m ;
    }

    /** Backspace Event */
    public void backspace() {
        machine.setStateNoCardDigits() ;
    }

   /**
     * Number Event
     * @param digit Digit pressed
     */    
    public void number( String digit ) {
        machine.setStateTwoCardDigits( digit ) ;
    }

    /** Valid Card Event */
    public void validCard() {

    }

    /** Invalid Card Event */
    public void invalidCard() {

    }
}