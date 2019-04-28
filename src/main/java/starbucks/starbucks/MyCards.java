

package starbucks ;

import java.text.DecimalFormat;

/** My Cards Screen */
public class MyCards extends Screen
{
   
	DecimalFormat df = new DecimalFormat("##.##");
	
	private IMenuCommand mycardspaynow;    

        
	
	private CardInfo cardInfo;
	private double cashValue = 0.00;
	private String cardValue = "";
	
    public MyCards(IMenuCommand t)
    {
    	cardInfo = CardInfo.getInstance();
    	cashValue = cardInfo.getCashAmount();
    	cardValue = String.format("%.2f", cashValue);
    	
    	mycardspaynow = t ;
       
    }
    
    /**
     * Pint out My Card Screen
     * @return Key Pad View Contents
     */   
    public String display() 
    {
    	this.cashValue = cardInfo.getCashAmount();
    	this.cardValue = String.format("%.2f", cashValue);
        String output =  "$" + cardValue;
               
        return output ;
    }
    
    /**
     * Switch to the MyCardPay Screen
     */
    public void touch(int x, int y) 
    {
        if ( y == 3)
        {
            if( x == 3 )
            {
                mycardspaynow.execute();
            }
        }      
    }
   
}
