package StrategyDesignPatternRainWaterExample;

public class TimeN2Space1 implements SolutionStrategy{
    @Override
    public int getResult(int[] A, int n) {
        int res = 0;

        for(int i = 1 ; i < n-1 ; i++){
            int leftMax = Integer.MIN_VALUE;
            int rightMax = Integer.MIN_VALUE;

            for(int j = 0 ; j < i ; j++){
                leftMax = Math.max(leftMax , A[j]);
            }

            for(int j = i+1 ; j < n ; j++){
                rightMax = Math.max(rightMax , A[j]);
            }

            int temp = Math.min(leftMax , rightMax) - A[i];
            res = res + Math.max(temp , 0);
        }

        return res;
    }
}
