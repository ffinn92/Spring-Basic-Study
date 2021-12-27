package decoratorPatternWorkOut;

public class UnderGripWorkOutDecorator extends BackWorkOutDecorator {

    public UnderGripWorkOutDecorator(final WorkOut workout) {
        super(workout);
    }

    @Override
    public void run(){
        super.run();
        System.out.print("등 하부를 조질것이다.");
    }
}
