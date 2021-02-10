package Pr3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Gitar implements Instrument {
    int struna;


    @Override
    public void play() {
        System.out.println("играет гитара количество струн " + struna);
    }
}
