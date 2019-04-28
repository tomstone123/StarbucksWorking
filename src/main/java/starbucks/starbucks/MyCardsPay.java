

package starbucks;

/** My Card Pay Screen */
public class MyCardsPay extends Screen
{
	
	private CardInfo cardInfo;
	private String cardNumber = "";
	private double cashValue = 0.00;
	
	private IMenuCommand mycardsnow;
	
    public MyCardsPay( IMenuCommand displayMyCards )
    {
    	cardInfo = CardInfo.getInstance();
    	
    	mycardsnow = displayMyCards ;

    }
    
    public String display() 
    {

    	cardNumber = cardInfo.getCardNumber();
        String output =  "\n[" + cardNumber + "]" ;
               output += "\n" ;
               output += "\n" ;
               output += "\n" ;
               output += "Scan Now\n" ;

        return output ;
    }
    
    public void touch(int x, int y) 
    {
        if ( y == 2 && x == 2 )
        {
        	cashValue = cardInfo.getCashAmount();
        	cashValue = cashValue - 1.50;
        	cardInfo.setCashAmount(cashValue);
        }
        
        if ( y == 3 && x == 3)
        {
        	mycardsnow.execute();
        }    
    }

}

