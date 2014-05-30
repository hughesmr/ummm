package speech;

import main.Main;
import edu.cmu.sphinx.frontend.util.Microphone;
import edu.cmu.sphinx.recognizer.Recognizer;
import edu.cmu.sphinx.result.Result;
import edu.cmu.sphinx.util.props.ConfigurationManager;
import gui.Inter;
import gui.PopUp;


public class Voice {
	
	
	public void recog(){
		
		 ConfigurationManager cm;

	            cm = new ConfigurationManager(Voice.class.getResource("helloworld.config.xml"));
	         
	     //   cm = new ConfigurationManager();
	        Recognizer recognizer = (Recognizer) cm.lookup("recognizer");
	        recognizer.allocate();

	        // start the microphone or exit if the programm if this is not possible
	        Microphone microphone = (Microphone) cm.lookup("microphone");
	        if (!microphone.startRecording()) {
	            recognizer.deallocate();
	            System.exit(1);
	        }
	        
	        
	        // loop the recognition until the programm exits.
	        while (true) {
	           

	            Result result = recognizer.recognize();

	            if (result != null) {
	                String resultText = result.getBestFinalResultNoFiller();
	                
	                
	                if(resultText.equals("um")){
	                	
	                	Main.count++;
	  
	                	Inter.label.setText(Integer.toString(Main.count));
	                	
	                	if(Main.count == 25 || Main.count == 50 || Main.count == 75 || Main.count == 100){
	            
	                		(new PopUp()).start();
	                	}
	                	
	                }
	                
	                
	            } else {
	                System.out.println("I can't hear what you said.\n");
	            }
	        }
	}
	
	
	
		
	

}
