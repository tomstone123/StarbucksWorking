

package starbucks ;

/** For Card Digits State */
public class NineCardDigits implements ICardState
{
    ICardStateMachine machine ;

    /**
     * Constructor
     * @param  m Reference to State Machine
     */
    public NineCardDigits( ICardStateMachine m )
    {
        this.machine = m ;
    }

    /**
     * Backspace Event
     */
    public void backspace() {
        machine.setStateEightCardDigits(null) ;
    }

    /**
     * Digit Entry Event
     * @param digit Digit Value
     */
    public void number( String digit ) {
        System.err.println( "Digit: " + digit ) ;
        return ;
    }

    /**
     * Valid Card Event
     */
    public void validCard() {
        return ;
    }

    /**
     * Invalid Card Event
     */
    public void invalidCard() {
        machine.setStateNoCardDigits() ;
    }

}
