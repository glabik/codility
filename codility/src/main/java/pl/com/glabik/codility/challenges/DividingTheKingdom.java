package pl.com.glabik.codility.challenges;

import java.util.Arrays;
/*
An old king wants to divide his kingdom between his two sons. He is well known for his justness and wisdom, and he plans to make a good use of both of these attributes while dividing his kingdom.
The kingdom is administratively split into square boroughs that form an N × M grid. Some of the boroughs contain gold mines. The king knows that his sons do not care as much about the land as they do about gold, so he wants both parts of the kingdom to contain exactly the same number of mines. Moreover, he wants to split the kingdom with either a horizontal or a vertical line that goes along the borders of the boroughs (splitting no borough into two parts).
The goal is to count how many ways he can split the kingdom.
Write a function:
    class Solution { public int solution(int N, int M, int[] X, int[] Y); }
that, given two arrays of K integers X and Y, denoting coordinates of boroughs containing the gold mines, will compute the number of fair divisions of the kingdom.
For example, given N = 5, M = 5, X = [0, 4, 2, 0] and Y = [0, 0, 1, 4], the function should return 3. The king can divide his land in three different ways shown on the picture below.
Divide horizontally in two ways or vertically in one way

Assume that:
        N and M are integers within the range [1..100,000];
        K is an integer within the range [1..100,000];
        each element of array X is an integer within the range [0..N−1];
        each element of array Y is an integer within the range [0..M−1].
Complexity:
        expected worst-case time complexity is O(N+M+K);
        expected worst-case space complexity is O(N+M+K) (not counting the storage required for input arguments).

Copyright 2009–2018 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited. 
 */
public class DividingTheKingdom {

	public int solution(int N, int M, int[] X, int[] Y) {
        // write your code in Java SE 8
        
        if((X.length % 2)!=0 || (Y.length % 2)!=0 ){
            return 0;
        }
        
        int xResult=0;
        int yResult=0;
        
        Arrays.sort(X);
        Arrays.sort(Y);
        
        int maxXLeft = X[X.length/2-1];
        int minXRight = X[X.length/2];
        
        int maxYDown = Y[Y.length/2-1];
        int minYUp = Y[Y.length/2];
        
        if(maxXLeft != minXRight){
            xResult = minXRight - maxXLeft;
        }
        
        if(maxYDown != minYUp){
            yResult = minYUp - maxYDown;
        }

        return xResult + yResult;
    }
}
