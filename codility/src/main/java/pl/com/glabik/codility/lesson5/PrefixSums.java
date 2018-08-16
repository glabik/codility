package pl.com.glabik.codility.lesson5;

/*
Write a function:
    class Solution { public int solution(int A, int B, int K); }

that, given three integers A, B and K, returns the number of integers within the range [A..B] that are divisible by K, i.e.:
    { i : A ≤ i ≤ B, i mod K = 0 }

For example, for A = 6, B = 11 and K = 2, your function should return 3, because there are three numbers divisible by 2 within the range [6..11], namely 6, 8 and 10.

Assume that:
        A and B are integers within the range [0..2,000,000,000];
        K is an integer within the range [1..2,000,000,000];
        A ≤ B.

Complexity:
        expected worst-case time complexity is O(1);
        expected worst-case space complexity is O(1).

Copyright 2009–2018 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited. 
 */
public class PrefixSums {
	
	public int solution(int A, int B, int K) {
		
		if(K == 1) {
			return B - A + 1;
		}
		
		if(A == B && A == 0) {
			return 1;
		}
		
		if(A == B) {
			return B / K;
		}

		int realA = A > 1 ? A-1 : A;
		
		int min = realA / K;
		int max = B / K;
		
		
		int result = max - min;
		
		if(A == 0) {
			return result + 1;
		}else {
			return result;
		}
	}

}
