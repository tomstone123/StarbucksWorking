
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
    private Frame frame;
    
    private IScreen mycards ;
    private String MyCards = "MyCards" ;
   
    
    public AddCard()
    {
        
        kp = new KeyPad() ;
        cn = new CardNumber();
        sp = new Spacer() ;
        cm = new CardEntryMachine();
        cid = new CID();
        cidm = new CIDEntryMachine();
        
        mycards = new MyCards() ;
        

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
        
        setNext( mycards, MyCards );

    }
    
    /**
     * Set Next Screen - Not Used 
     * @param s Next Screen Object
     * @param n Next Screen Label
     */
    public void setNext(IScreen s, String n )  {
        frame.nextScreen();
    }
    
    /**
     * Send Previous Screen - Not Used
     * @param s Previous Screen Object
     * @param n Previous Screen Label
     */
    public void setPrev(IScreen s, String n )  {
        // add code here
    }  
    
    //Not used
    public void correctCardNumber()
    {
        
    }

}
