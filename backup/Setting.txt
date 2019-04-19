

package starbucks;

/** Settings Screen */
public class Settings extends Screen implements IApp
{

    private IApp app = new AppController() ;
    private KeyPad kp;
    private Passcode pc;
    private PinScreen ps;
    private Spacer sp ;
    
    
    public Settings(){
        kp = new KeyPad() ;
        pc = new Passcode() ;
        sp = new Spacer() ;
        ps = new PinScreen() ;
        
        // setup the composite pattern
        ps.addSubComponent( pc ) ;
        ps.addSubComponent( sp ) ;
        ps.addSubComponent( kp ) ;
        
       
    }



    /**
     * Switch to Landscape View
     */
     public void landscape() {
    //     if ( authenticated )
    //         app.landscape() ;
     }

     /**
      * Switch to Portait View
      */
     public void portrait() {
     //    if ( authenticated )
     //        app.portrait() ;
     }

     /**
      * User Touch at X,Y Coordinates
      * @param x X Coordinate
      * @param y Y Coordinate
      */
     public void touch(int x, int y) {
  
             app.touch(x, y) ;

     }

     /**
      * Display Screen Contents to Terminal
     * @return 
      */
     public void display() {
         System.out.println( screenContents() ) ;
     }

     /**
      * Get Class Name of Screen
      * @return Class Name of Current Screen
      */
     public String screen() {
         
             return app.screen() ;
        
     }

     /**
      * Get Screen Contents as a String
      * @return Screen Contents of Current Screen
      */
     public String screenContents() {
         
             String out = "" ;
             out = "----------------\n" ;
             out += "   " + ps.name() + "  \n" ;
             out += "----------------\n\n\n" ;
             out += ps.display() ;
             out += "\n\n\n----------------\n" ;
             return out ;
         
     }


	/**
     * Select a Menu Command
     * @param c Menu Option (A, B, C, E, or E)
     */
    public void execute( String c ) {
            app.execute( c ) ;
    }

   
}
