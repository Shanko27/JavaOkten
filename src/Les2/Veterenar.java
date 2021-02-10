package Les2;

import dz2.Animal;

public class Veterenar {
    public Veterenar() {
    }

    public void treatAnimal(Animal animal) {
        System.out.println(animal.getFood() + " " + animal.getLocation());
    }
}
