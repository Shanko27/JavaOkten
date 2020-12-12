package dz2;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@NoArgsConstructor
public class Horse extends Animal{

    private String  horseBreeds;
    private String workingQuality;

    public Horse(String food, String location, String horseBreeds, String workingQuality) {
        super(food, location);
        this.horseBreeds = horseBreeds;
        this.workingQuality = workingQuality;
    }

    @Override
    public String makeNoise() {
        return "Hours " + super.makeNoise() + " igogo";
    }

    @Override
    public String eat() {
        return "Hours " + super.eat();
    }

    @Override
    public String sleep() {
        return "Hours " + super.sleep();
    }
}
