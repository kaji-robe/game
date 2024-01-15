package jp.co.kiramex.polymorphism;

public class PolymorphismSample {

    public static void main(String[] args) {
        //スーパークラス型の配列変換で領域を確保
        Animal [] animals = new Animal[3];

        //Dog、Dachshund、Catのインスタンスを生成し
        //aninimals配列の各要素として代入

        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Dachshund();

        newBarking(animals);
    }

    public static void newBarking(Animal[] animals) {
        for(Animal animal : animals) {
            animal.barking();
        }
    }

}
