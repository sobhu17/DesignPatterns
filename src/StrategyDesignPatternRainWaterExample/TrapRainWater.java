package StrategyDesignPatternRainWaterExample;

public class TrapRainWater {

    public int Solve(int[] A , int n , SolvingMethod solvingMethod){
        SolutionStrategy solutionStrategy = SolutionFactory.getSolutionOnTheBasisOfInput(solvingMethod);

        return solutionStrategy.getResult(A , n);
    }
}
