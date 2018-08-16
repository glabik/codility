package pl.com.glabik.codility.challenges;

import java.util.Arrays;

/*
You are given N round clocks.

Every clock has M hands, and these hands can point to positions 1, 2, 3, ..., P (yes, these represent numbers around each face). The clocks are represented by the matrix A consisting of N rows and M columns of integers. The first row represents the hands of the first clock, and so on.

For example, you are given matrix A consisting of five rows and two columns, and P = 4:
  A[0][0] = 1    A[0][1] = 2
  A[1][0] = 2    A[1][1] = 4
  A[2][0] = 4    A[2][1] = 3
  A[3][0] = 2    A[3][1] = 3
  A[4][0] = 1    A[4][1] = 3

You can rotate the clocks to obtain several clocks that look identical. For example, if you rotate the third, fourth and fifth clocks you can obtain the following clocks:

After rotation, the first, third and fourth clocks look the same, and the second clock looks the same as the fifth one. That means there are four pairs of clocks that look the same: (1, 3), (1, 4), (2, 5) and (3, 4).

Write a function:

    class Solution { public int solution(int[][] A, int P); }

that, given a zero-indexed matrix A consisting of N rows and M columns of integers and integer P, returns the maximal number of pairs of clocks that can look the same after rotation.

For example, given the following array A and P = 4:
    A[0][0] = 1     A[0][1] = 2
    A[1][0] = 2     A[1][1] = 4
    A[2][0] = 4     A[2][1] = 3
    A[3][0] = 2     A[3][1] = 3
    A[4][0] = 1     A[4][1] = 3

the function should return 4, as explained above.

Assume that:

        N and M are integers within the range [1..500];
        P is an integer within the range [1..1,000,000,000];
        each element of matrix A is an integer within the range [1..P];
        the elements of each row of matrix A are all distinct.

Complexity:

        expected worst-case time complexity is O(N*M*log(N+M));
        expected worst-case space complexity is O(N*M) (not counting the storage required for input arguments).

Copyright 2009–2018 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited. 
 */
public class Clock {

	
	public int solution(int[][] A, int P) {
		
		int[][] angles = new int[0][0];
		
		int angle=0;
		for(int i=0; i<A.length; i++) {
			
			angles = new int[A.length][A[i].length-1];
			
			for(int j=0; j<A[i].length-1; j++) {
				
				angle = calculateAngle(A[i][j], A[i][j+1], P);
				
				angles[i][j] = angle;
				
			}
		}
		
		for(int i=0; i<angles.length; i++) {
			for(int j=0; j<angles[i].length; j++) {
				System.out.println(String.format("[%d][%d] = %d", i, j, angles[i][j]));
			}
		}
		
		
		return 0;
	}
	
	protected int calculateAngle(int posA, int posB, int scale) {
		int angle = Math.abs(posA - posB) * 360 / scale ;
		if(angle > 180) {
			angle = 360 - angle;
		}
		return angle;
	}
	
}
