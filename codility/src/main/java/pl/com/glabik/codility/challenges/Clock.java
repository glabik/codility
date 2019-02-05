package pl.com.glabik.codility.challenges;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
		
		Map<String, Integer> representationsMap = new HashMap<>();
		Map<Integer, Long> occurencesMap = new HashMap<>();
	
        
		
//		System.out.println("--------------------------------------");;
//		System.out.println("--------------------------------------");;
//		System.out.println("--------------------------------------");;
		
		for(int i=0; i<A.length; i++) {
//			System.out.println("---"+Arrays.toString(A[i]));
			
			Arrays.sort(A[i]);
			
//			System.out.println(String.format("point=%s", Arrays.toString(A[i])));;
			
//			String basePointStrTmp = toStringValue(A[i]);
//			if(A[i][0]==1 && representationsMap.containsKey(basePointStrTmp)) {
//				Integer idx = representationsMap.get(basePointStrTmp);
//				occurencesMap.put(idx, occurencesMap.get(idx)+1);
//			}else {
//				
//				int[] ROT = new int[A[i].length];
//				for(int j=0; j<A[i].length; j++) {
//					ROT[j] = P - A[i][j] + 1;
//				}
////				System.out.println(String.format("----ROT=%s", Arrays.toString(ROT)));;
//				int[][] ROT_POINT = new int[A[i].length][A[i].length];
//				for(int j=0; j<ROT.length; j++) {
//					ROT_POINT[j]= Arrays.copyOf(A[i], A[i].length);					
////					System.out.println(String.format("----ROT_POINT[%d]=%s",j, Arrays.toString(ROT_POINT[j])));;				
//					for(int k=0; k<ROT.length; k++) {
//						if(ROT[j] == P)
//							continue;
////						System.out.println(String.format("----ROT_POINT[%d][%d]=%d, move by %d", j,k,ROT_POINT[j][k], ROT[j] ));;
//						ROT_POINT[j][k] = A[i][k] + ROT[j];
//						if(ROT_POINT[j][k] > P) {
//							ROT_POINT[j][k] = ROT_POINT[j][k] - P;
//						}
//					}
////					System.out.println(String.format("--ROT_POINT[%d]=%s",j, Arrays.toString(ROT_POINT[j])));;
//				}
//				String info = "";
//				for(int j=0; j<ROT_POINT.length; j++) {
//					info += " "+Arrays.toString(ROT_POINT[j]);
//				}
////				System.out.println(String.format("----ROT_POINTS: %s", info));;				
//				int[] basePointArray = ROT_POINT[0];
//				Arrays.sort(basePointArray);
//				String basePointStr = toStringValue(basePointArray);
//				if(representationsMap.containsKey(basePointStr)) {
//					Integer idx = representationsMap.get(basePointStr);
//					occurencesMap.put(idx, occurencesMap.get(idx)+1);
//				}else {				
//					representationsMap.put(basePointStr, i);
//					for(int j=1; j<ROT.length; j++) {
//						basePointArray = ROT_POINT[j];
//						Arrays.sort(basePointArray);
//						basePointStr = toStringValue(basePointArray);
//						representationsMap.put(basePointStr, i);
//					}
//					occurencesMap.put(i, 1l);
//				}
//			}
			
			
			
			
			occurencesMap.put(i, 0l);
			String basePointStr=null;
			boolean shouldAddNew = true;
			second: 
			for(int j=0; j<A[i].length; j++) {
				
				long startTime = System.nanoTime();
				
				int point = A[i][j];
				
				int rotatesCount = P - point + 1;
				int[] basePointArray = rotateBy(A[i], rotatesCount, P);
				Arrays.sort(basePointArray);
				basePointStr = toStringValue(basePointArray);

				if(j==0 && representationsMap.containsKey(basePointStr)) {
					Integer idx = representationsMap.get(basePointStr);
					occurencesMap.put(idx, occurencesMap.get(idx)+1);
					shouldAddNew = false;
//					System.out.println(String.format("-------%s -- basePointStr %s -- wynik szukania: %s -- shouldAddNew: %s", point, basePointStr, map.get(basePointStr), shouldAddNew));
					break second;
				}
					
				representationsMap.put(basePointStr, i);
				
				long endTime = System.nanoTime();
		        long duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
		        System.out.println(String.format("time_[%s][%s]: %s", i, j, duration));
				
//				System.out.println(String.format("-------%s -- basePointStr %s -- wynik szukania: %s -- shouldAddNew: %s", point, basePointStr, map.get(basePointStr), shouldAddNew));
			}
			
			if(shouldAddNew) {
//				Integer idx = representationsMap.get(basePointStr);
				occurencesMap.put(i, 1l);
//				System.out.println(String.format("--dodano: %s", basePointStr));
			}
			
			
			
			
//			System.out.println("-------"+Arrays.toString(rotations));
//			for (Map.Entry<String, Integer> entry : map.entrySet()){
//			    System.out.println(entry.getKey() + "/" + entry.getValue());
//			}

//			System.out.println(" ---------------------------------------------------------- basePoint="+basePoint);
			
		}
		
        
		int pairs = 0;
		for (Map.Entry<Integer, Long> entry : occurencesMap.entrySet()){
			if(entry.getValue()<2) {
				continue;
			}
			pairs +=  silnia(entry.getValue()).divide(silnia(2).multiply(silnia(entry.getValue()-2))).intValue();
		}
        
//		System.out.println("pairs "+pairs);
		
		return pairs;
	}
	

	
	
	private static BigInteger silnia(long i){
		if (i < 1)
			return BigInteger.ONE;
		else
			return BigInteger.valueOf(i).multiply(silnia(i - 1));
	}
	
	
	protected int[][] generateAllRotates(int[] pointArray, int P) {
		int[][] result = new int[P][];
		for(int i=0; i<P; i++) {
			result[i] = rotateBy(pointArray, i, P);
		}
		return result;
	}
	
	protected int[] rotateBy(int[] pointArray, int rotateBy, int P) {
		if(rotateBy==P)
			return Arrays.copyOf(pointArray, pointArray.length);
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
			pointSB.append(".");
			pointSB.append(pointArray[i]);
		}
		return pointSB.toString();
	}
	
	protected BigInteger toBigIntValue(int[] pointArray) {
		Arrays.sort(pointArray);
		StringBuffer pointSB = new StringBuffer(); 
		for(int i=0; i<pointArray.length; i++) {
			pointSB.append(pointArray[i]);
		}
		return new BigInteger(pointSB.toString());
	}
}
