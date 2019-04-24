

package starbucks ;

/** Pin Authentication Subject */
public interface IAddCardSubject
{
    /**
     * Add a Pin Auth Observer
     * @param obj Observer Object
     */
    void registerObserver( IAddCardObserver obj ) ;

    /**
     * Remove Observer
     * @param obj Pin AUth Observer to Remove
     */
    void removeObserver( IAddCardObserver obj ) ;

    /**
     * Broadcast Event to Observers
     */
    void notifyObserver( ) ;
    
}
