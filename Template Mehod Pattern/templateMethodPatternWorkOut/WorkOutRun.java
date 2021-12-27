package templateMethodPatternWorkOut;

public class WorkOutRun {
    public static void main(String[] args) {
        ChestWorkOut Babel = new ChestBabelPress();
        ChestWorkOut Dumbbell = new ChestDumbbellPress();

        Babel.workOut();

        System.out.println();

        Dumbbell.workOut();
    }
}
