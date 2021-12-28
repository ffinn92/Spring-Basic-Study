package factoryMethodPatternBook;

public class Dog extends Animal{
    //추상 팩토리 메서드 오버라이팅
    @Override
    AnimalToy getToy() {
        return new DogToy();
    }
}
