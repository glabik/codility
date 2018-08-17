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
		
		String[] occurences = new String[A.length];
		
		for(int i=0; i<A.length; i++) {
			
			String pointInfo = Arrays.toString(A[i]);
//			System.out.println(" start rotate for "+pointInfo);
			
			Arrays.sort(A[i]);
			
			String basePoint;
			int firstPoint = A[i][0];
			if(firstPoint==1) {
				basePoint = toStringValue(A[i]);
			}else {
			
				int rotatesCount = P - firstPoint +1;
				
				int[] basePointArray = rotateBy(A[i], rotatesCount, P);
				
				basePoint = toStringValue(basePointArray);
				
				System.out.println("     rotatesCount="+rotatesCount);
			}
			
			System.out.println(" start rotate for "+pointInfo+"    base point is "+basePoint);
			occurences[i] = basePoint;
			
		}
		

		Arrays.sort(occurences);
		System.out.println(" occurences " + Arrays.toString(occurences));
		boolean isPairedAlready = false;
		int pairs = 0;
		String prevVal=occurences[0];
		for(int i=1; i<occurences.length; i++) {
			
			if(occurences[i].equals(prevVal) && !isPairedAlready) {
				pairs+=2;
				isPairedAlready = true;
			}else if(occurences[i].equals(prevVal) && isPairedAlready){
			    pairs+=1;
			}else if(!occurences[i].equals(prevVal)){
				prevVal = occurences[i];
				isPairedAlready = true;
			}
						
			
		}
		
		return pairs;
	}
	
	
	protected int[][] generateAllRotates(int[] pointArray, int P) {
		int[][] result = new int[P][];
		for(int i=0; i<P; i++) {
			result[i] = rotateBy(pointArray, i, P);
		}
		return result;
		
	}
	
	protected int[] rotateBy(int[] pointArray, int rotateBy, int P) {
//		System.out.println(" rotating point "+Arrays.toString(pointArray));
		int[] result = new int[pointArray.length];
		int val=0;
		for(int i=0; i<pointArray.length; i++) {
			val = pointArray[i] + rotateBy;
			if(val > P) {
				val = val - P;
			}
			result[i] = val;
//			System.out.println(" ---- "+i + "="+Arrays.toString(result));
		}
		return result;
	}
	
	protected String toStringValue(int[] pointArray) {
		Arrays.sort(pointArray);
		StringBuffer pointSB = new StringBuffer(); 
		for(int i=0; i<pointArray.length; i++) {
			pointSB.append(pointArray[i]);
		}
		return pointSB.toString();
	}
	
}
