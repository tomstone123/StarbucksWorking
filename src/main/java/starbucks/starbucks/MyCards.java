

package starbucks ;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/** My Cards Screen */
public class MyCards extends Screen
{
   
	DecimalFormat df = new DecimalFormat("#.##");
	
	private CardInfo cardInfo;
	private double cashValue = 0.01;
	private String cardValue = "";
	
    public MyCards()
    {
    	cardInfo = new CardInfo();
    	cashValue = cardInfo.getCashAmount();
    	cardValue = String.format("%.2f", cashValue);

       
    }
    
    /**
     * Pint out Settings Menu
     * @return Key Pad View Contents
     */
    
    public String display() 
    {
    	this.cashValue = cardInfo.getCashAmount();
    	this.cardValue = String.format("%.2f", cashValue);
        String output =  "$" + cardValue;
               
        return output ;
    }

   
}
