package decoratorPatternWorkOut;

public class BackWorkOutPlan {
    public static void main(String[] args) {
        final WorkOut backWorkOut = new BackWorkOut();
        backWorkOut.run();
        System.out.println();

        final WorkOut overGripWorkOut = new OverGripWorkOutDecorator(new BackWorkOut());
        overGripWorkOut.run();
        System.out.println();

        final WorkOut underGripWorkOut = new UnderGripWorkOutDecorator(new BackWorkOut());
        underGripWorkOut.run();
        System.out.println();

        final WorkOut parallelGripWorkOut = new UnderGripWorkOutDecorator(new OverGripWorkOutDecorator(new BackWorkOut()));
        parallelGripWorkOut.run();
        System.out.println();
    }
}
