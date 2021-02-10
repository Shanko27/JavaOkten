package dz1;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Int {

    int a1;
    int a2;
    int a3;
    int a4;
    int a5;
    int a6;
    int a7;
    int a8;
    int a9;
    int a0;

    public int addition() {
        return a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a0;
    }

    public int subtraction() {
        return a1 - a2 - a3 - a4 - a5 - a6 - a7 - a8 - a9 - a0;
    }

    public int multiplication() {
        return a1 * a2 * a3 * a4 * a5 * a6 * a7 * a8 * a9 * a0;
    }

    public int division() {
        return a1 / a2 / a3 / a4 / a5 / a6 / a7 / a8 / a9 / a0;
    }
}
