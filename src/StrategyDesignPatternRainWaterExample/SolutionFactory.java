package StrategyDesignPatternRainWaterExample;

public class SolutionFactory {

    public static SolutionStrategy getSolutionOnTheBasisOfInput(SolvingMethod solvingMethod){
        return switch (solvingMethod){
            case TIME_N_SPACE_1 -> new TimeNSpace1();
            case TIME_N_SPACE_N -> new TimeNSpaceN();
            case TIME_N2_SPACE_1 -> new TimeN2Space1();
        };
    }
}
