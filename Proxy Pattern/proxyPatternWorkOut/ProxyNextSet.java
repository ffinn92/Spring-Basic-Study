package proxyPatternWorkOut;

public class ProxyNextSet implements NextSet {
    private NextSet nextset;

    public ProxyNextSet(){
    }

    @Override
    public void workOut(String shouting) {
        if(nextset == null){
            nextset = new RealNextSet();
        }

        System.out.println("트레이너 : 회원님 2분은 쉬셔야 합니다.");
        nextset.workOut(shouting);
    }
}
