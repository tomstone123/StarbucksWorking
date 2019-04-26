

package starbucks ;

/** For CID Digits State */
public class ThreeCIDDigits implements ICIDState
{
    ICIDStateMachine machine ;

    /**
     * Constructor
     * @param  m Reference to State Machine
     */
    public ThreeCIDDigits( ICIDStateMachine m )
    {
        this.machine = m ;
    }

    /**
     * Backspace Event
     */
    public void backspace() {
        machine.setStateTwoCIDDigits(null) ;
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
     * Valid CID Event
     */
    public void validCID() {
        return ;
    }

    /**
     * Invalid CID Event
     */
    public void invalidCID() {
        machine.setStateNoCIDDigits() ;
    }

}
