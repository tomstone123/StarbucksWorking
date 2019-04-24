
package starbucks;

import java.util.* ;

/**
 * Add New Card Screen
 */
public class AddCard extends Screen
{
    private KeyPad kp;
    private CardNumber cn;
    private Spacer sp ;
    private CardEntryMachine cm;
   
    
    public AddCard()
    {
        kp = new KeyPad() ;
        cn = new CardNumber();
        sp = new Spacer() ;
        cm = new CardEntryMachine();
        
        // setup the composite pattern
        this.addSubComponent( cn );
        this.addSubComponent( sp ) ;
        this.addSubComponent( kp ) ;
        
        // setup the observer pattern
        ((IKeyPadSubject)kp).attach( cn ) ;
        ((IKeyPadSubject)kp).attach( cm ) ;
        ((IAddCardSubject)cm).registerObserver(this) ;

    }
}
