package bessant.chris.test.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    // Test that the returned value is an Integer between 0 and 4
    public void testQuotSelector() {
    	boolean valid;
    	App a = new App();
        Integer q = App.selectQuote();
        
        if (q < 5 && q > -1) {
        	valid = true;
        } else {
        	valid = false;
        }
        
        assertTrue("Valid status: ", valid);
        
    }
    
    public void testQuote() {
    	App a = new App();
    	String quote = a.getQuote(0);
    	assertEquals("In the beginning there was nothing, which exploded - Terry Pratchet", quote);
    }
    
    
}
