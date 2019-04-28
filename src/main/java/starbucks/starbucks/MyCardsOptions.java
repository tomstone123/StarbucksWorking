

package starbucks;

/** My Card Options Screen */
public class MyCardsOptions extends Screen
{
   
	
	private IMenuCommand moreoptions;
	
	
    public MyCardsOptions(IMenuCommand v)
    {
       moreoptions = v;
    }
    
    public String display() 
    {
        
        String output =  "\nReload\n" ;
               output += "Refresh\n" ;
               output += "More Options\n" ;
               output += "Cancel\n" ;

        return output ;
    }
    
    /**
     * Switch to the MyCardPay Screen
     */
    public void touch(int x, int y) 
    {
    	if ( y == 7)
        {
            if( x > 0 && x < 4 )
            {
                moreoptions.execute();
            }
        }    

    }

   
}
