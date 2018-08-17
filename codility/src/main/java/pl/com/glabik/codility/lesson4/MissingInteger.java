package pl.com.glabik.codility.lesson4;

import java.util.Arrays;

import javax.swing.text.StyleContext.SmallAttributeSet;

/*
Write a function:

    class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Assume that:

        N is an integer within the range [1..100,000];
        each element of array A is an integer within the range [−1,000,000..1,000,000].

Complexity:

        expected worst-case time complexity is O(N);
        expected worst-case space complexity is O(N) (not counting the storage required for input arguments).

Copyright 2009–2018 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited. 
 * */
public class MissingInteger {
	
	public int solution(int[] A) {
		
		if(A.length==0) {
			return 1;
		}
		
		Arrays.sort(A);
		
		if(A[0]>1) {
			return 1;
		}
		
		System.out.println(Arrays.toString(A));
		
		boolean breakeFounded=false;
		int result = 0;
		int smallestPositive=A[0];
		
		int prevVal = A[0];
		for(int i=1; i<A.length; i++) {
			if(A[i]>0 && smallestPositive<=0) {
				smallestPositive = A[i];
			}
			if(A[i]>0 && prevVal>0 && A[i]-prevVal>1) {
				result = prevVal+1;
				breakeFounded = true;
				break;
			}
			prevVal = A[i];
		}
		
		if(!breakeFounded) {
			System.out.println("smallestPositive: "+smallestPositive+" max: "+A[A.length-1]);
			result = smallestPositive>1 ? 1 : A[A.length-1]+1;
		}
		return result > 0 ? result : 1;
	}

}
