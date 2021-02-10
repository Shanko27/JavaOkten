package Les6;

import Les4.Car;
import Les4.CarType;
import Les4.Engine;
import dz1.Strin;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;


public class Main {
    public static void main(String[] args) throws ParseException {
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        Date date = simpleDateFormat.parse("2020-12-19");
//        System.out.println(date);
//SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd/MM/yyyy");
//        System.out.println(simpleDateFormat1.format(date));
//
//        LocalDate localDate = LocalDate.parse("2020-12-19");
//        System.out.println(localDate.format(DateTimeFormatter.ofPattern("yyyy/MM/dd")));

//        Set<String> stringSet = new TreeSet<>();
//        stringSet.add("third");
//        stringSet.add("second");
//        stringSet.add("first");
//        System.out.println(stringSet);

//        Set<Person> set = new TreeSet<>();
//        set.add(new Person(1, "Olena", LocalDate.of(1992,12,10)));
//        set.add(new Person(2, "Volodymyr", LocalDate.of(1999, 2, 20)));
//        set.add(new Person(3,"Roman", LocalDate.of(1990, 4, 7)));
//        set.add(new Person(2, "Ira", LocalDate.of(1999, 2, 20)));
//        for (Person person : set) {
//            System.out.println(person);
//        }

//        String s = "a";
//        String s1 = "A";
//        System.out.println(s.compareTo(s1));


//        List<Person> list = new ArrayList<>();
//        list.add(new Person(1, "Olena", LocalDate.of(1992,12,10)));
//        list.add(new Person(2, "Volodymyr", LocalDate.of(1999, 2, 20)));
//        list.add(new Person(3,"Roman", LocalDate.of(1990, 4, 7)));
//        list.add(new Person(2, "Ira", LocalDate.of(1999, 2, 20)));
//        System.out.println("Before sort:");
//                for (Person person : list) {
//                    System.out.println(person);
//                }
//            list.sort(new personIdComperator());

//list.sort(new Comparator<Person>() {
//    @Override
//    public int compare(Person o1, Person o2) {
//        return o1.getId() - o2.getId();
//    }
//});
//        list.sort((o1, o2) -> o1.getId() - o2.getId());
//                    System.out.println("\nAfter sort:");
//                    for (Person person : list) {
//                        System.out.println(person);
//                    }
        Map<Person, List<Car>> map = new HashMap<>();

        map.put(new Person(3, "Roman", LocalDate.of(1990, 4, 7)), new ArrayList<>());
        map.put(new Person(2, "Ira", LocalDate.of(1999, 2, 20)), new ArrayList<>());

        addCarToPerson(3,
                new Car(new Engine(2, 4), "Audi", 32000, CarType.SEDAN),
                map);
        printMap(map);
    }

    public static void addCarToPerson(int personId, Car car, Map<Person, List<Car>> map) {
        final Set<Person> set = map.keySet();
        for (Person person : set) {
            if (person.getId() == personId) {
                map.get(person).add(car);
            }
        }
    }

    public static void printMap(Map<Person, List<Car>> map) {
        final Set<Map.Entry<Person, List<Car>>> entries = map.entrySet();
        for (Map.Entry<Person, List<Car>> entry : entries) {
            System.out.println(entry.getKey() + ":");
            for (Car car : entry.getValue()) {
                System.out.println("\t" + car);
            }
        }


    }
}
