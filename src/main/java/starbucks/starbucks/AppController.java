

package starbucks ;

/**
 * Main App Controller Class
 */
public class AppController implements IApp {

    private IScreen mycards ;
    private IScreen store ;
    private IScreen rewards ;
    private IScreen payments ;
    private IMenuCommand displayMyCards ;
    private IMenuCommand displayPayments ;
    private IMenuCommand displayRewards ;
    private IMenuCommand doStore ;
    private IFrame frame ;
    
    //My Code
    private IScreen settings ;
    private IMenuCommand displaySettings ;
    private IScreen addcard ;
    private IMenuCommand displayAddcard ;
    private IScreen mycardspay ;
    private IMenuCommand displayMyCardsPay ;
    private IScreen mycardsoptions ;
    private IMenuCommand displayMyCardsOptions ;
    private IScreen moreoptions ;
    private IMenuCommand displayMoreOptions ;

    public AppController() {
    	
        
        displayMyCardsPay = new MenuCommand() ;
        displayMyCardsPay.setReceiver(
                new IMenuReceiver() {
                    /** Command Action */
                    public void doAction() {
                        frame.setCurrentScreen( mycardspay ) ;
                        
                    }
              }
              ) ;
        
        displayMyCardsOptions = new MenuCommand() ;
        displayMyCardsOptions.setReceiver(
                new IMenuReceiver() {
                    /** Command Action */
                    public void doAction() {
                        frame.setCurrentScreen( mycardsoptions ) ;
                        
                    }
              }
              ) ;
        
        displayMoreOptions = new MenuCommand() ;
        displayMoreOptions.setReceiver(
                new IMenuReceiver() {
                    /** Command Action */
                    public void doAction() {
                        frame.setCurrentScreen( moreoptions ) ;
                        
                    }
              }
              ) ;
    	
    	mycards = new MyCards(displayMyCardsPay, displayMyCardsOptions) ;
        store = new Store() ;
        rewards = new Rewards() ;
        payments = new Payments() ;
        frame = new Frame( mycards ) ;
        

        // setup command pattern
        displayMyCards  = new MenuCommand() ;
        displayPayments = new MenuCommand() ;
        displayRewards  = new MenuCommand() ;
        doStore         = new MenuCommand() ;
        displaySettings = new MenuCommand() ;
        
        
        //My Code
        displayAddcard = new MenuCommand() ;
        displayAddcard.setReceiver(
                new IMenuReceiver() {
                    /** Command Action */
                    public void doAction() {
                        frame.setCurrentScreen( addcard ) ;                        
                    }
              }
              ) ;

              
        settings = new Settings(displayAddcard) ;
        addcard = new AddCard(displayMyCards, displaySettings) ;
        mycardspay = new MyCardsPay(displayMyCards);
        mycardsoptions = new MyCardsOptions(displayMoreOptions);
        moreoptions = new MyCardsMoreOptions();
        

        
        
        displayMyCards.setReceiver(
          new IMenuReceiver() {
              /** Command Action */
              public void doAction() {
                  frame.setCurrentScreen( mycards ) ;
              }
        }
        ) ;
        
        displayPayments.setReceiver(
          new IMenuReceiver() {
              /** Command Action */
              public void doAction() {
                  frame.setCurrentScreen( payments ) ;
              }
        }
        ) ;
        
        displayRewards.setReceiver(
          new IMenuReceiver() {
              /** Command Action */
              public void doAction() {
                  frame.setCurrentScreen( rewards ) ;
              }
        }
        ) ;
        
        doStore.setReceiver(
          new IMenuReceiver() {
              /** Command Action */
              public void doAction() {
                  frame.setCurrentScreen( store ) ;
              }
        }
        ) ;
        
        //My Code
        displaySettings.setReceiver(
                new IMenuReceiver() {
                    /** Command Action */
                    public void doAction() {
                        frame.setCurrentScreen( settings ) ;
                    }
              }
              ) ;
              
        
        
        
        frame.setMenuItem ( "A", displayMyCards ) ;
        frame.setMenuItem ( "B", displayPayments ) ;
        frame.setMenuItem ( "C", displayRewards ) ;
        frame.setMenuItem ( "D", doStore ) ;        
        //My Code
        frame.setMenuItem ( "E", displaySettings ) ;
                
    }


    /**
      * Switch to Landscape Mode
      */
    public void landscape() {
        frame.landscape() ;
    }

    /**
     * Switch to Portait Mode
     */
    public void portrait() {
        frame.portrait() ;
    }

    /**
     * Send In Touch Events
     * @param x X Coord
     * @param y Y Coord
     */
    public void touch(int x, int y) {
        frame.touch(x, y) ;
    }

    /**
     * Display Current Screen
     */
    public void display() {
        frame.display() ;
    }

    /**
     * Execute Menu Bar Command
     * @param c Menu Bar Option (A, B, C, D or E)
     */
    public void execute( String c ) {
        frame.cmd( c ) ;
    }

    /**
     * Navigate to Previous Screen
     */
    public void prev() {
        frame.previousScreen() ;
    }

    /**
     * Navigate to Next Screen
     */
    public void next() {
        frame.nextScreen() ;
    }

    /**
     * Get Current Screen Name
     * @return Screen Name
     */
    public String screen() {
        return frame.screen() ;
    }

    /**
     * Get Current Screen Contents
     * @return Current Screen Contents
     */
    public String screenContents() {
        return frame.contents() ;
    }

}
