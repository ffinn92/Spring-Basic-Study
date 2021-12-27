package decoratorPatternWorkOut;

public class ParallelGripWorkOutDecorator extends BackWorkOutDecorator {

    public ParallelGripWorkOutDecorator(final WorkOut workout) {
        super(workout);
    }

    @Override
    public void run() {
        super.run();
    }
}
