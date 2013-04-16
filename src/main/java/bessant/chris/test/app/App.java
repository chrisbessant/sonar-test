package bessant.chris.test.app;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * This is purely a simple test class. It's purpose is only to create a Maven project which
 * can be build by Bamboo and have stats generated by Sonar. 
 */

public class App 
{
    private static final int NUM_OF_QUOTES = 5;
    
 // A little over the top for this purpose maybe ...
    private static final int ZERO = 0;
    private static final int ONE = 1;
    private static final int TWO = 2;
    private static final int THREE = 3;
    private static final int FOUR = 4; 
    
    private static String[] quote = new String[NUM_OF_QUOTES];
    private static final Logger logger = Logger.getLogger(App.class.getName());
    
	
    public static void main( String[] args ) {
        App a = new App();
        int q = selectQuote();
        logger.log(Level.INFO, a.getQuote(q)); // Using Logger to keep Sonar happy
    }
    
    public static int selectQuote() {
    	Random randomGenerator = new Random();
    	return randomGenerator.nextInt(NUM_OF_QUOTES); 
    }
    
    public String getQuote(int q) {	
    	
    	quote[ZERO] = "In the beginning there was nothing, which exploded - Terry Pratchet";
    	quote[ONE] = "Nothing happens until something moves - Albert Einstein";
    	quote[TWO] = "Photons have mass? I didn’t even know they were Catholic - Woody Allen";
    	quote[THREE] = "No, this trick won't work... How on earth are you ever going to explain in terms of chemistry and physics so important a biological phenomenon as first love? - Albert Einstein";
    	quote[FOUR] = "Physics isn't the most important thing. Love is - Richard P Feynman";
    	
    	return quote[q];
    }
    
}
