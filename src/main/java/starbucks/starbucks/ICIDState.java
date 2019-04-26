package starbucks;


/**
 * CID State Interfaces
 */
public interface ICIDState
{
    /** Backspace Event */
    void backspace() ;

    /**
     * Number Event
     * @param digit Digit/Key Pressed
     */
    void number( String digit ) ;
    
    /** Valid CID Event */
    void validCID() ;

    /** Invalid CID Event */
    void invalidCID() ;
}