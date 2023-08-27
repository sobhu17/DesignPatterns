package StrategyDesignPatternRainWaterExample;

public class TimeNSpaceN implements SolutionStrategy{
    @Override
    public int getResult(int[] A, int n) {
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        leftMax[0] = A[0];
        for(int i = 1 ; i < n ; i++){
            leftMax[i] = Math.max(leftMax[i-1] , A[i]);
        }

        rightMax[n-1] = A[n-1];
        for(int i = n-2 ; i >= 0 ; i--){
            rightMax[i] = Math.max(rightMax[i+1] , A[i]);
        }

        int res = 0;
        for(int i = 1 ; i < n-1 ; i++){
            int temp = Math.min(leftMax[i-1] , rightMax[i+1]) - A[i];
            res = res + Math.max(temp , 0);
        }

        return res;
    }
}
