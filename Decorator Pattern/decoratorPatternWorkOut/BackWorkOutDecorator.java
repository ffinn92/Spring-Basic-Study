package decoratorPatternWorkOut;

public class BackWorkOutDecorator implements WorkOut{
    private WorkOut workout;

    public BackWorkOutDecorator(final WorkOut workout){
        this.workout = workout;
    }

    @Override
    public void run() {
        workout.run();
    }
}
