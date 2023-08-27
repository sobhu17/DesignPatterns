package StrategyDesignPatternRainWaterExample;

public class TimeNSpace1 implements SolutionStrategy{

    @Override
    public int getResult(int[] A, int n) {
        int leftMax = 0;
        int rightMax = 0;
        int res = 0;
        int l = 0;
        int r = n-1;

        while(l <= r){
            if(A[l] <= A[r]){
                if(leftMax < A[l]){
                    leftMax = A[l];
                }
                else{
                    res = res + (leftMax - A[l]);
                }
                l++;
            }
            else{
                if(rightMax < A[r]){
                    rightMax = A[r];
                }
                else{
                    res = res + (rightMax - A[r]);
                }
                r--;
            }
        }

        return  res;
    }
}
