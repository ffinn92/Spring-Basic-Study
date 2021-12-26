package proxyPatternWorkOut;

public class RealNextSet implements NextSet {
    @Override
    public void workOut(String shouting) {
        System.out.println("헬린이: " + shouting);
    }
}
