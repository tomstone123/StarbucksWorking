
package starbucks;

/**
 * Add New Card Screen
 */
public class AddCard extends Screen implements IAddCardObserver
{    
    private KeyPad kp;
    private CardNumber cn;
    private CID cid;
    private Spacer sp ;
    private CardEntryMachine cm;
    private CIDEntryMachine cidm;
    
    //private IScreen mycards ;
    private IMenuCommand mycardnext ;
    private IMenuCommand settingsprev;
    
   
    
    public AddCard(IMenuCommand displayMyCards, IMenuCommand displaySettings)
    {
        
        kp = new KeyPad() ;
        cn = new CardNumber();
        sp = new Spacer() ;
        cm = new CardEntryMachine();
        cid = new CID();
        cidm = new CIDEntryMachine();
        mycardnext = displayMyCards;
        settingsprev = displaySettings;
        
        

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

    
    public void setNext(IMenuCommand s)  {
        mycardnext = s;
    }
    
    public void setPrev(IMenuCommand t)  {
        settingsprev = t;
    }
     
    
    @Override
    public void next()
    {
    	mycardnext.execute();
    }
    
    @Override
    public void prev()
    {
    	settingsprev.execute();
    	
    }

	public void correctCardNumber() {
		// TODO Auto-generated method stub
		
	}


    


}
