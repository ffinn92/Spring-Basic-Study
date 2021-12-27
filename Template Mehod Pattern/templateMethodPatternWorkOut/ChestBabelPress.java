package templateMethodPatternWorkOut;

public class ChestBabelPress extends ChestWorkOut{

    //추상 메서드 오버라이딩
    @Override
    void select() {
        System.out.println("바벨을 선택한다.");
    }


    //Hook(갈고리) 메서드 오버라이딩
    @Override
    void move() {
        System.out.println("렉으로 이동한다.");
    }
}
