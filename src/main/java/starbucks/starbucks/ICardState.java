package starbucks;


/**
 * Card State Interfaces
 */
public interface ICardState
{
    /** Backspace Event */
    void backspace() ;

    /**
     * Number Event
     * @param digit Digit/Key Pressed
     */
    void number( String digit ) ;
    
    /** Valid Card Event */
    void validCard() ;

    /** Invalid Card Event */
    void invalidCard() ;
}
