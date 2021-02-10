package dz1;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class User {
    private int id;
    private int age;
    private String name;
    private String surname;
    private double weight;
    private double height;

    public int rec(int n) {
        int num1 = n / 100;
        int num2 = (n % 100) / 10;
        int num3 = n % 10;

        return (num3 * 100 + num2 * 10 + num1);
    }
}
