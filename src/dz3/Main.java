package dz3;

import java.util.ArrayList;
import java.util.List;

//        а) Определить интерфейс Printable, содержащий метод void print().
//        б) Определить класс Book, реализующий интерфейс Printable.
//        в) Определить класс Magazine, реализующий интерфейс Printable.
//        г) Создать массив типа Printable, который будет содержать книги и журналы.
//        д) В цикле пройти по массиву и вызвать метод print() для каждого объекта.
//        е) Создать статический метод printMagazines(Printable[] printable) в классе Magazine,
//        который выводит на консоль названия только журналов.
//        Создать статический метод printBooks(Printable[] printable) в классе Book,
//        который выводит на консоль названия только книг. Используем оператор instanceof.
public class Main {
    public static void main(String[] args) {



        List<Printable>  printables = new ArrayList<>();
        printables.add(new Book(1,"romans"));
        printables.add(new Book(2,"history"));
        printables.add(new Magazine(1,"cool"));
        printables.add(new Magazine(1,"times"));

        for (Printable print : printables) {
            print.print(); }


Magazine.printMagazines(printables);
        Book.printBooks(printables);

    }
}
