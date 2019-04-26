

package starbucks ;

/** One Pig Digit State */
public class OneCIDDigits implements ICIDState
{
    ICIDStateMachine machine ;

    /**
     * Constructor
     * @param  m Reference to State Machine
     */
    public OneCIDDigits( ICIDStateMachine m )
    {
        this.machine = m ;
    }

    /** Backspace Event */
    public void backspace() {
        machine.setStateNoCIDDigits() ;
    }

   /**
     * Number Event
     * @param digit Digit pressed
     */    
    public void number( String digit ) {
        machine.setStateTwoCIDDigits( digit ) ;
    }

    /** Valid CID Event */
    public void validCID() {

    }

    /** Invalid CID Event */
    public void invalidCID() {

    }
}