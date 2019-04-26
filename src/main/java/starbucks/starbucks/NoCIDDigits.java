package starbucks;


/**
 * No CID State
 */
public class NoCIDDigits implements ICIDState
{
    ICIDStateMachine machine ;

    /**
     * Constructor
     * @param  m Reference to State Machine
     */
    public NoCIDDigits( ICIDStateMachine m )
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
        machine.setStateOneCIDDigit( digit ) ;
    }

    /** Valid CID Event */
    public void validCID() {
    }

    /** Invalid CID Event */
    public void invalidCID() {
    }
}
