package pl.com.glabik.codility.lesson5;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class PrefixSumsTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public PrefixSumsTest( String testName ){
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite(){
        return new TestSuite( PrefixSumsTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testForValues(){
    	PrefixSums ps = new PrefixSums();
    	int A = 6;
    	int B = 11;
    	int K = 2;
    	assertEquals(3, ps.solution(A, B, K));
    	
    	A = 1;
    	B = 14;
    	K = 7;
    	assertEquals(2, ps.solution(A, B, K));
    	
    	A = 1;
    	B = 1;
    	K = 3;
    	assertEquals(0, ps.solution(A, B, K));
    	
    	A = 0;
    	B = 0;
    	K = 3;
    	assertEquals(1, ps.solution(A, B, K));
    	
    	A = 0;
    	B = 1;
    	K = 3;
    	assertEquals(1, ps.solution(A, B, K));
    	
    	A = 0;
    	B = 70;
    	K = 7;
    	assertEquals(11, ps.solution(A, B, K));
    	
    	A = 0;
    	B = 2;
    	K = 2;
    	assertEquals(2, ps.solution(A, B, K));
    	
    	A = 0;
    	B = 20;
    	K = 2;
    	assertEquals(11, ps.solution(A, B, K));
    	
    	A = 0;
    	B = 19;
    	K = 2;
    	assertEquals(10, ps.solution(A, B, K));
    	
    	A = 1;
    	B = 2;
    	K = 1;
    	assertEquals(2, ps.solution(A, B, K));
    	
    	A = 0;
    	B = 0;
    	K = 1;
    	assertEquals(1, ps.solution(A, B, K));
    	
    	A = 2;
    	B = 2;
    	K = 2;
    	assertEquals(1, ps.solution(A, B, K));
    	
    	A = 2;
    	B = 2;
    	K = 1;
    	assertEquals(1, ps.solution(A, B, K));

    	A = 2;
    	B = 2;
    	K = 5;
    	assertEquals(0, ps.solution(A, B, K));
    	
    	A = 0;
    	B = 2;
    	K = 1;
    	assertEquals(3, ps.solution(A, B, K));
    	
    	A = 0;
    	B = 2_000_000_000;
    	K = 2;
    	assertEquals(1_000_000_001, ps.solution(A, B, K));
    	
    	A = 0;
    	B = 2_000_000_000;
    	K = 1;
    	assertEquals(2_000_000_001, ps.solution(A, B, K));
    	
    	A = 2_000_000_000;
    	B = 2_000_000_000;
    	K = 1;
    	assertEquals(1, ps.solution(A, B, K));
    	
    	A = 1;
    	B = 2_000_000_000;
    	K = 1;
    	assertEquals(2_000_000_000, ps.solution(A, B, K));
    	
    	A = 1;
    	B = 2_000_000_000;
    	K = 1_000_000_000;
    	assertEquals(2, ps.solution(A, B, K));
    	
    	A = 0;
    	B = 2_000_000_000;
    	K = 1_000_000_000;
    	assertEquals(3, ps.solution(A, B, K));
    	
    	A = 11;
    	B = 14;
    	K = 2;
    	assertEquals(2, ps.solution(A, B, K));
    }

}
