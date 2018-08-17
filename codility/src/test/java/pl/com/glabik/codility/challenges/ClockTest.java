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
    	int P;
    	int[][] A;
    	
    	P = 4;
    	A = new int[5][2];
    	A[0][0] = 1;     A[0][1] = 2;
    	A[1][0] = 2;     A[1][1] = 4;
    	A[2][0] = 4;     A[2][1] = 3;
    	A[3][0] = 2;     A[3][1] = 3;
    	A[4][0] = 1;     A[4][1] = 3;    

        assertEquals(4, c.solution(A, P));
        
        
        P = 8;
        A = new int[4][3];
    	A[0][0] = 2;     A[0][1] = 3;     A[0][2] = 7;
    	A[1][0] = 8;     A[1][1] = 7;     A[1][2] = 3;
    	A[2][0] = 2;     A[2][1] = 5;     A[2][2] = 1;
    	A[3][0] = 8;     A[3][1] = 1;     A[3][2] = 4;

        assertEquals(3, c.solution(A, P));
        
        
    	
    	P = 10;
        A = new int[3][5];
    	A[0][0] = 1;     A[0][1] = 5;     A[0][2] = 6;     A[0][3] = 7;     A[0][4] = 8;
    	A[1][0] = 1;     A[1][1] = 5;     A[1][2] = 6;     A[1][3] = 7;     A[1][4] = 8;
    	A[2][0] = 1;     A[2][1] = 5;     A[2][2] = 6;     A[2][3] = 7;     A[2][4] = 8;

        assertEquals(3, c.solution(A, P));
        
        
        P = 23;
        A = new int[8][5];
    	A[0][0] = 1;     A[0][1] = 5;     A[0][2] = 6;     A[0][3] = 7;     A[0][4] = 8;
    	A[1][0] = 1;     A[1][1] = 5;     A[1][2] = 6;     A[1][3] = 7;     A[1][4] = 8;
    	A[2][0] = 8;     A[2][1] = 5;     A[2][2] = 6;     A[2][3] = 7;     A[2][4] = 1;
    	A[3][0] = 8;     A[3][1] = 5;     A[3][2] = 7;     A[3][3] = 6;     A[3][4] = 1;
    	A[4][0] = 8;     A[4][1] = 6;     A[4][2] = 7;     A[4][3] = 5;     A[4][4] = 1;
    	A[5][0] = 8;     A[5][1] = 1;     A[5][2] = 7;     A[5][3] = 5;     A[5][4] = 6;
    	A[6][0] = 1;     A[6][1] = 1;     A[6][2] = 1;     A[6][3] = 2;     A[6][4] = 2;
    	A[7][0] = 1;     A[7][1] = 1;     A[7][2] = 4;     A[7][3] = 7;     A[7][4] = 7;

        assertEquals(6, c.solution(A, P));
    }
    
//    public void testCalculateAngle(){
//    	Clock c = new Clock(); 
//
//        assertEquals(90, c.calculateAngle(1, 2, 4));
//        assertEquals(180, c.calculateAngle(2, 4, 4));
//        assertEquals(90, c.calculateAngle(4, 3, 4));
//        assertEquals(90, c.calculateAngle(2, 3, 4));
//        assertEquals(180, c.calculateAngle(1, 3, 4));
//    }
}
