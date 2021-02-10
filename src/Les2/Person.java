package Les2;

import lombok.*;

@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Getter
public class Person {

    private int id;
    private String name;

    public void saySmth(String smth) {
        System.out.println(smth);
        System.out.println(smth);
        System.out.println(smth);
    }

    public String combine() {
        return id + ": " + name;
    }

}
