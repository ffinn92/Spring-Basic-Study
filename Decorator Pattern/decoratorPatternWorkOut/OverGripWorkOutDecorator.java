package decoratorPatternWorkOut;

public class OverGripWorkOutDecorator extends BackWorkOutDecorator {

    public OverGripWorkOutDecorator(final WorkOut workout) {
        super(workout);
    }

    @Override
    public void run(){
        super.run();
        System.out.print("등 상부를 조질것이다.");
    }
}
