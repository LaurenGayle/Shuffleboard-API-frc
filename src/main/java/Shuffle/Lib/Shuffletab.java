package Shuffle.Lib;

import edu.wpi.first.wpilibj.shuffleboard.*;

public class Shuffletab{
     


    public interface Shuffletablib {
    
        public String tabname;
        public String tab_name ="";
        public String dataentry ;
    
    }
   
public void NewTab(ShuffleboardTab Shufflelib ){

    Shufflelib.getLayout(Shuffletablib.tab_name);
  
    }
}

