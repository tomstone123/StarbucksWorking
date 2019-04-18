 

import java.util.ArrayList;

public class SettingScreen implements ITouchEventHandler, IDisplayComponent 
{

    ITouchEventHandler nextHandler ;
    
    

    public String display() {
        String output =  " Add Starbucks Cards\n" ;
        return output ;
    }


    public void addSubComponent(IDisplayComponent c) {
        // TODO Auto-generated method stub
        
    }


    public void touch(int x, int y) {
        
        
    }


    public void setNext(ITouchEventHandler next) {
        // TODO Auto-generated method stub
        
    }
    
    
    

}
