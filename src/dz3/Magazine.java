package dz3;


import lombok.*;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class Magazine implements Printable {


    int id;
    String name;


    @Override
    public void print() {

        System.out.println(id + " " + name);

    }

    public static void printMagazines(List<Printable> printables) {
        for (Printable printable : printables) {
            if (printable instanceof Magazine) {
                System.out.println(((Magazine) printable).name);
            }
        }

    }
}
