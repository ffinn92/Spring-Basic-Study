package factoryMethodPatternBook;

public class Driver {
    public static void main(String[] args) {
        //팩터리 메서드를 보유한 객체를 생성
        Animal bolt = new Dog();

        //팩토리 메서드가 반환하는 객체들
        AnimalToy boltBall = bolt.getToy();

        //팩토리 메서드가 반환한 객체들을 사용
        boltBall.identify();
    }
}
