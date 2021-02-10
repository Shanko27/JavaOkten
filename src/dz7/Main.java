
//В плані домашнього: щоб не вигадувати всяке різне, просто пройдіться по ВСІХ операціях стріма,
//        бажано по декілька разів.
//        Особливо спробуйте  flatMap i collect(toMap(...)), декілька завдань внизую
//        Придумайте щось з ускладнених завдань, працюючи з List<Person>,
//        кожен з об'єктів якого має List<Book>, наприклад:
//        1. згенерувати мапу <Person, Integer>, де Integer - кількість сторінок усіх книжок, які має людина
//        2. згенерувати мапу <String, Book>, де String - ім'я людини, Book - книжка з найбільшою кількістю сторінок
//        3. згенерувати List<Book> відфільтрувавши тільких тих людей,
//        хто старше 25 років і книжки які мають більше 500 сторінок
package dz7;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();
        list.add(new Person(1, "Olena", LocalDate.of(1992, 12, 10)));
        list.add(new Person(2, "Volodymyr", LocalDate.of(1999, 2, 20)));
        list.add(new Person(3, "Roman", LocalDate.of(1990, 4, 7)));
        list.add(new Person(2, "Ira", LocalDate.of(1999, 2, 20)));

        List<Book> books = new ArrayList<>();
        books.add(new Book("qwe", 501));
        books.add(new Book("asd", 123));
        books.add(new Book("zxc", 543));
        books.add(new Book("rty", 666));
        books.add(new Book("fgh", 123));
        books.add(new Book("cvb", 211));
        books.add(new Book("ewq", 333));
        books.add(new Book("dsa", 654));
        books.add(new Book("cxz", 234));
        books.add(new Book("tgb", 126));
        books.add(new Book("oiu", 534));
        books.add(new Book("tjo", 444));

        List<Book> b1 = books.subList(0, 3);
        List<Book> b2 = books.subList(3, 6);
        List<Book> b3 = books.subList(6, 9);
        List<Book> b4 = books.subList(9, 12);


        Map<Person, Integer> intMap = new HashMap<>();
        intMap.put(list.get(0), b1.stream().mapToInt(Book::getPage).sum());
        intMap.put(list.get(1), b2.stream().mapToInt(Book::getPage).sum());
        intMap.put(list.get(2), b3.stream().mapToInt(Book::getPage).sum());
        intMap.put(list.get(3), b4.stream().mapToInt(Book::getPage).sum());

        System.out.println(intMap);

        Map<String, Book> strMap = new HashMap<>();
        strMap.put(list.get(0).getName(), b1.stream().sorted(((o1, o2) -> o2.getPage() - o1.getPage())).limit(1).collect(Collectors.toList()).get(0));
        strMap.put(list.get(1).getName(), b2.stream().sorted(((o1, o2) -> o2.getPage() - o1.getPage())).limit(1).collect(Collectors.toList()).get(0));
        strMap.put(list.get(2).getName(), b3.stream().sorted(((o1, o2) -> o2.getPage() - o1.getPage())).limit(1).collect(Collectors.toList()).get(0));
        strMap.put(list.get(3).getName(), b4.stream().sorted(((o1, o2) -> o2.getPage() - o1.getPage())).limit(1).collect(Collectors.toList()).get(0));

        System.out.println(strMap);

        List<Person> c = list.stream().filter(per -> (LocalDate.now().getYear() - per.getLocalDate().getYear()) > 25).collect(Collectors.toList());
        System.out.println(c);
        List<Book> co = books.stream().filter(book -> book.getPage() > 500).collect(Collectors.toList());
        System.out.println(co);


        Map<Person, List<Book>> mpb = new HashMap<>();
        mpb.put(list.get(0), b1);
        mpb.put(list.get(1), b2);
        mpb.put(list.get(2), b3);
        mpb.put(list.get(3), b4);


        for (Map.Entry<Person, List<Book>> entry : mpb.entrySet()) {
            if (LocalDate.now().getYear() - entry.getKey().getLocalDate().getYear() > 25) {
                List<Book> boo = entry.getValue().stream().filter(book -> book.getPage() > 500).collect(Collectors.toList());
                System.out.println(boo);
            }

        }

    }
}
