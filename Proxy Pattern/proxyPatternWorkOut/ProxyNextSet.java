package proxyPatternWorkOut;

public class ProxyNextSet implements NextSet {
    private NextSet nextset;

    public ProxyNextSet() {
    }

    @Override
    public void workOut(String shouting) throws InterruptedException {
        if (nextset == null) {
            nextset = new RealNextSet();
        }

        System.out.println("트레이너 : 회원님 이 운동은 5초는 쉬셔야 합니다.");
        for (int i = 0; i < 6; i++) {
            Thread.sleep(1000);
            System.out.println(i+"초");
        }

        nextset.workOut(shouting);
    }
}
