package dz1;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Strin {
    String b1 ;
    String b2;
    String b3;
    String b4;
    String b5;
    String b6;
    String b7;
    String b8;
    String b9;
    String b0;
    public String sentence () {
        return b1 + b2 + b3 + b4 + b5 + b6 + b7 + b8 + b9 + b0;
    }
}
