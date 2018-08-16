package pl.com.glabik.codility.challenges;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import pl.com.glabik.codility.AppTest;


public class ClockTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ClockTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( ClockTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testClock(){
    	
    	Clock c = new Clock();
    	
    	int[][] A = new int[5][2];
    	A[0][0] = 1;     A[0][1] = 2;
    	A[1][0] = 2;     A[1][1] = 4;
    	A[2][0] = 4;     A[2][1] = 3;
    	A[3][0] = 2;     A[3][1] = 3;
    	A[4][0] = 1;     A[4][1] = 3;    

        assertEquals(4, c.solution(A, 4));;
    }
    
    public void testCalculateAngle(){
    	Clock c = new Clock(); 

        assertEquals(90, c.calculateAngle(1, 2, 4));
        assertEquals(180, c.calculateAngle(2, 4, 4));
        assertEquals(90, c.calculateAngle(4, 3, 4));
        assertEquals(90, c.calculateAngle(2, 3, 4));
        assertEquals(180, c.calculateAngle(1, 3, 4));
    }
}