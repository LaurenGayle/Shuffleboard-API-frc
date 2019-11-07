package Shuffle.Lib;


import edu.wpi.first.shuffleboard.api.widget.Layout;
import edu.wpi.first.wpilibj.shuffleboard.*;


public class Shuffletab{
     



    public interface ShufflelibTAB {
    
        
        public String tab_name ="";
       
        
      
    
    }


    
   
    public void NewTab( ShuffleboardTab shufflelibTab){

    shufflelibTab.getLayout(ShufflelibTAB.tab_name);
    
    }


}

