package pl.com.glabik.codility.challenges;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class DividingTheKingdomTest extends TestCase 
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public DividingTheKingdomTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( DividingTheKingdomTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testDividingTheKingdom(){
    	
    	DividingTheKingdom dk = new DividingTheKingdom();
    	
    	int N = 5;
    	int M = 5;
    	int[] X = new int[] {0, 4, 2, 0};
    	int[] Y = new int[] {0, 0, 1, 4};
    	
    	assertEquals(3, dk.solution(N, M, X, Y));
    }

}
