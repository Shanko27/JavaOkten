package Les4;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Engine {

    private int volume;
    private int cylinderNumber;

    public void startEngine() {
        System.out.println("Start");
    }
}
