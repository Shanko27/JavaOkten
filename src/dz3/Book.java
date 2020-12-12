package dz3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Book implements Printable {
int id;
 String name;
    @Override
    public void print() {
        System.out.println(id + " " + name);
    }

    public static void printBooks(List<Printable> printable) {
        for (Printable printables : printable) {
            if (printables instanceof Book){
                System.out.println(((Book) printables).name);
            }

        }
    }
}
