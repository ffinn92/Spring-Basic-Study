package adapterPatternWorkOut;

public class AdapterPatternWorkOutDemo {
    public static void main(String[] args) {
        PowerRack powerRack = new PowerRack();

        powerRack.workOut(4,"스쿼트");
        powerRack.workOut(10,"벤치프레스");
        powerRack.workOut(13,"바벨로우");
    }

}
