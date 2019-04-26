
package starbucks ;

/** To CID Digits State */
public class TwoCIDDigits implements ICIDState
{
    ICIDStateMachine machine ;


    /**
     * Constructor
     * @param  m Reference to State Machine
     */    
    public TwoCIDDigits( ICIDStateMachine m )
    {
        this.machine = m ;
    }

    /** Backspace Event */
    public void backspace() {
        machine.setStateOneCIDDigit( null );
    }

    /**
     * Number Event
     * @param digit Digit pressed
     */
    public void number( String digit ) {
        machine.setStateThreeCIDDigits( digit ) ;
    }

    /** Valid CID Event */
    public void validCID() {

    }

    /** Invalid CID Event */
    public void invalidCID() {

    }

}
