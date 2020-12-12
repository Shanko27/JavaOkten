package dz2;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Setter
@Getter
@ToString
public class Cat extends Animal{
    private String woolLenght;
    private String temperament;

    public Cat(String food, String location, String woolLenght, String temperament) {
        super(food, location);
        this.woolLenght = woolLenght;
        this.temperament = temperament;
    }

    @Override
    public String makeNoise() {
        return "Cat " + super.makeNoise() + " miau";
    }

    @Override
    public String eat() {
        return "Cat " + super.eat();
    }

    @Override
    public String sleep() {
        return "Cat " + super.sleep();
    }
}
