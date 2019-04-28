package starbucks;


/**
 * Singleton class for tracking card information entered.
 */
public class CardInfo
{

	private static CardInfo instance = null ;
	
	private String cardNumber = "" ;
	private String cid = "" ;
	private double cashAmount = 0;

    public CardInfo()
    {}
    
    public static CardInfo getInstance() 
    {   	
		if( instance == null ) 
        {
            instance = new CardInfo() ;
        }            
        return instance;
    }
    
    public void setCardNumber( String a )
    {
    	this.cardNumber = a;
    }
    
    public String getCardNumber()
    {
    	return this.cardNumber;
    }
    
    public void setCID ( String b )
    {
    	this.cid = b;
    }
    
    public String getCID()
    {
    	return this.cid;
    }
    
    public void setCashAmount ( double c )
    {
    	this.cashAmount = c;
    }
    
    public double getCashAmount()
    {
    	return this.cashAmount;
    }
    
}
