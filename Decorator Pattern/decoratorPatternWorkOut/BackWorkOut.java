package decoratorPatternWorkOut;

public class BackWorkOut implements WorkOut{

    @Override
    public void run() {
        System.out.print("등운동을 할것이다.");
    }
}
