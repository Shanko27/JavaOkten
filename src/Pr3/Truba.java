package Pr3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Truba implements Instrument {
    int diametr;

    @Override
    public void play() {
        System.out.println("играет труба диаметром " + diametr);
    }
}
