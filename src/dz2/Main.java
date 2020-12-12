package dz2;
//Создать класс Animal и расширяющие его классы Dog, Cat, Horse.
//        Класс Animal содержит переменные food, location и методы makeNoise, eat, sleep.
//        Метод makeNoise, например, может выводить на консоль "Такое-то животное спит".
//        Dog, Cat, Horse переопределяют методы makeNoise, eat.
//        Добавьте переменные в классы Dog, Cat, Horse, характеризующие только этих животных.
//        Создайте класс Ветеринар, в котором определите метод void treatAnimal(Animal animal).
//        Пусть этот метод распечатывает food и location пришедшего на прием животного.
//        В методе main создайте массив типа Animal, в который запишите животных всех имеющихся у вас типов.
//        В цикле отправляйте их на прием к ветеринару.
import Les2.Veterenar;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

Dog dog1 = new Dog();
        System.out.println(dog1.makeNoise());
        System.out.println(dog1.sleep());
        System.out.println(dog1.eat());

Cat cat1 = new Cat();
        System.out.println(cat1.makeNoise());
        System.out.println(cat1.sleep());
        System.out.println(cat1.eat());

Horse hours1 = new Horse();
        System.out.println(hours1.makeNoise());
        System.out.println(hours1.sleep());
        System.out.println(hours1.eat());
Veterenar veterenar = new Veterenar();

        ArrayList<Animal> animal = new ArrayList<>();
        animal.add(new Dog("meat", "Ukraine", "big", "protection" ));
        animal.add(new Cat("meat", "USA", "smooth-haired", "hot" ));
        animal.add(new Horse("oat", "Ukraine", "steppe", "riders" ));

        for (Animal anim: animal){
veterenar.treatAnimal(anim);
        }
    }
}
