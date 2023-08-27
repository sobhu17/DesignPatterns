package StrategyDesignPatternRainWaterExample;

public class Client {
    public static void main(String[] args) {
        int[] A = {3, 0, 2, 0, 4};
        int n = A.length;

        TrapRainWater trapRainWater = new TrapRainWater();

        System.out.println(trapRainWater.Solve(A , n , SolvingMethod.TIME_N_SPACE_1));
    }
}
