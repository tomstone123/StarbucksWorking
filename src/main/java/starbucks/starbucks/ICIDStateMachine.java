package starbucks;


/**
 * CID State Machine Interface
 */
public interface ICIDStateMachine
{
    /** Backspace Event */
    void backspace() ;

    /**
     * Number/Key Pressed Event
     * @param digit Key
     */
    void number( String digit ) ;

    /** Valid CID Event *
    void validCID() ;

    /** Invalid CID Event *
    void invalidCID() ;

    ** Set Next State to No CID State */
    void setStateNoCIDDigits() ;

    /** 
     * Set Next State to One CID state
     * @param digit CID So Far
     */
    void setStateOneCIDDigit( String digit ) ;

    /** 
     * Set Next State to Two CID state
     * @param digit CID So Far
     */    
    void setStateTwoCIDDigits( String digit ) ;

    /** 
     * Set Next State to Three CID state
     * @param digit CID So Far
     */    
    void setStateThreeCIDDigits( String digit ) ;

}
