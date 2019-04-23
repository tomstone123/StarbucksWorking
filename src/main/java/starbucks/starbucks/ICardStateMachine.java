package starbucks;


/**
 * Card State Machine Interface
 */
public interface ICardStateMachine
{
    /** Backspace Event */
    void backspace() ;

    /**
     * Number/Key Pressed Event
     * @param digit Key
     */
    void number( String digit ) ;

    /** Valid Card Event *
    void validCard() ;

    /** Invalid Card Event *
    void invalidCard() ;

    ** Set Next State to No Card State */
    void setStateNoCardDigits() ;

    /** 
     * Set Next State to One Card state
     * @param digit Card So Far
     */
    void setStateOneCardDigit( String digit ) ;

    /** 
     * Set Next State to Two Card state
     * @param digit Card So Far
     */    
    void setStateTwoCardDigits( String digit ) ;

    /** 
     * Set Next State to Three Card state
     * @param digit Card So Far
     */    
    void setStateThreeCardDigits( String digit ) ;

    /** 
     * Set Next State to Four Card state
     * @param digit Card So Far
     */    
    void setStateFourCardDigits( String digit ) ;
    
    /** 
     * Set Next State to Four Card state
     * @param digit Card So Far
     */    
    void setStateFiveCardDigits( String digit ) ;
    
    /** 
     * Set Next State to Four Card state
     * @param digit Card So Far
     */    
    void setStateSixCardDigits( String digit ) ;
    
    /** 
     * Set Next State to Four Card state
     * @param digit Card So Far
     */    
    void setStateSevenCardDigits( String digit ) ;
    
    /** 
     * Set Next State to Four Card state
     * @param digit Card So Far
     */    
    void setStateEightCardDigits( String digit ) ;
    
    /** 
     * Set Next State to Four Card state
     * @param digit Card So Far
     */    
    void setStateNineCardDigits( String digit ) ;
}
