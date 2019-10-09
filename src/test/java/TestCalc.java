
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import tutorial4.Calc;

/**
 * Unit test for simple App.
 */
public class TestCalc 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public TestCalc( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( TestCalc.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testadd()
    {
        assertTrue(Calc.add(3,2)==5);
    }
    
    public void testsubtract()
    {
        assertTrue(Calc.subtract(3,2)==1);
    }
}
