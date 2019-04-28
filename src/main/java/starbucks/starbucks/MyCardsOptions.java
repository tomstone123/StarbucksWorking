

package starbucks;

/** My Card Options Screen */
public class MyCardsOptions extends Screen
{
   
    public MyCardsOptions()
    {
       
    }
    
    public String display() 
    {
        
        String output =  "Reload\n" ;
               output += "Refresh\n" ;
               output += "More Options\n" ;
               output += "Cancel\n" ;

        return output ;
    }

   
}
