package dz2;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class Dog extends Animal{
private String size;
private String dogBreeds;

    @Override
    public String makeNoise() {
        return "Dog " + super.makeNoise() + " gav";
    }

    @Override
    public String eat() {
        return "Dog " +super.eat();
    }

    @Override
    public String sleep() {
        return "Dog " + super.sleep();
    }

    public Dog(String food, String location, String size, String dogBreeds) {
        super(food, location);
        this.size = size;
        this.dogBreeds = dogBreeds;
    }
}
