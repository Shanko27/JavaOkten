package Pr3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Dram implements Instrument {
    String size;

    @Override
    public void play() {
        System.out.println("играет барабан размером " + size);
    }
}
