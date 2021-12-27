package templateMethodPatternWorkOut;

public abstract class ChestWorkOut {
    public void workOut(){
        move();
        select();
        System.out.println("리프팅!");
        System.out.println("네거티브!");
    }

    //Hook(갈고리) 메서드
    void move() {
        System.out.println("이동한다.");
    }

    //추상메서드
    abstract void select();

}
