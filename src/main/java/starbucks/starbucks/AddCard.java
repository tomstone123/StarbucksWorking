
package starbucks;

import java.util.* ;

/**
 * Add New Card Screen
 */
public class AddCard extends Screen implements IAddCardObserver
{
    private String enteredCID = "";
    
    private KeyPad kp;
    private CardNumber cn;
    private CID cid;
    private Spacer sp ;
    private CardEntryMachine cm;
    private CIDEntryMachine cidm;
   
    
    public AddCard()
    {
        
        kp = new KeyPad() ;
        cn = new CardNumber();
        sp = new Spacer() ;
        cm = new CardEntryMachine();
        cid = new CID();
        cidm = new CIDEntryMachine();
        
        cn.setNext(cid);
        cid.setNext(cn);
        
        
        // setup the composite pattern
        this.addSubComponent( cn ) ;
        this.addSubComponent( cid ) ;
        this.addSubComponent( sp ) ;
        this.addSubComponent( kp ) ;
        
        // setup the observer pattern
        ((IKeyPadSubject)kp).attach( cn ) ;
        ((IKeyPadSubject)kp).attach( cm ) ;
        ((IAddCardSubject)cm).registerObserver(this) ;
        
        ((IKeyPadSubject)kp).attach( cid ) ;
        ((IKeyPadSubject)kp).attach( cidm ) ;
        ((IAddCardSubject)cidm).registerObserver(this) ;

    }
    
    //Not used
    public void correctCardNumber()
    {
        
    }

}
