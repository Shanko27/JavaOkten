package Les7;

import Les6.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//      final Predicate<Person> personPredicate = new Predicate<Person>() {
//
//            @Override
//            public boolean test(Person o) {
//                return o.getName().startsWith("o");
//            }
//        };

        final Predicate<Person> personPredicate =
                o -> o.getName().startsWith("o");


        Person person = new Person(1, "olena", LocalDate.of(1992, 12, 10));
        System.out.println(personPredicate.test(person));

        Consumer<Person> personConsumer = new Consumer<Person>() {
            @Override
            public void accept(Person person) {
                System.out.println(person);
            }
        };

        personConsumer.accept(person);
//        Supplier<Person> personSupplier = new Supplier<Person>() {
//            @Override
//            public Person get() {
//                return new Person(3,"Roman", LocalDate.of(1990, 4, 7));
//            }
//        };

        Supplier<Person> personSupplier = () -> new Person(3, "Roman", LocalDate.of(1990, 4, 7));

        personConsumer.accept(personSupplier.get());

//        Function<Person, String> personStringFunction = new Function<Person, String>() {
//            @Override
//            public String apply(Person person) {
//                return person.getId() + ":" + person.getName();
//            }
//        };

        Function<Person, String> personStringFunction = person1 -> {
            final String s = person1.getId() + ":" + person1.getName();
            return s.toUpperCase();
        };
        System.out.println(personStringFunction.apply(person));


        List<Person> list = new ArrayList<>();
        list.add(new Person(1, "Olena", LocalDate.of(1992, 12, 10)));
        list.add(new Person(2, "Volodymyr", LocalDate.of(1999, 2, 20)));
        list.add(new Person(3, "Roman", LocalDate.of(1990, 4, 7)));
        list.add(new Person(2, "Ira", LocalDate.of(1999, 2, 20)));

        list.forEach(System.out::println);

        List<String> names = list.stream().map(Person::getName).collect(Collectors.toList());
        System.out.println(names);

//        list.stream().sorted((o1, o2) -> o1.getId() - o2.getId());
        List<Person> collect = list.stream()
                .sorted(Comparator.comparingInt(Person::getId))
                .collect(Collectors.toList());
        collect.forEach(System.out::println);

        final List<Person> collect1999 = list.stream()
                .filter(person11 -> person11.getBirthDate().getYear() == 1999)
                .collect(Collectors.toList());
        collect1999.forEach(System.out::println);

        final List<Integer> collect1999id = list.stream()
                .filter(person11 -> person11.getBirthDate().getYear() == 1999)
                .map(Person::getId)
                .collect(Collectors.toList());
        collect1999.forEach(System.out::println);

        final List<Person> col = list.stream().limit(3)
                .sorted((o1, o2) -> o2.getName().compareTo(o1.getName()))
                .collect(Collectors.toList());
        col.forEach(System.out::println);

        final double averageAge = list.stream().mapToInt(person1 -> {
            final LocalDate birthDate = person1.getBirthDate();
            final LocalDate now = LocalDate.now();
            return now.getYear() - birthDate.getYear();
        }).average().getAsDouble();

        final List<Person> elders = list.stream().filter(person1 -> {
            final LocalDate birthDate = person.getBirthDate();
            final LocalDate now = LocalDate.now();
            return now.getYear() - birthDate.getYear() > averageAge;
        }).collect(Collectors.toList());

        final List<Person> yongOnes = list.stream().filter(person1 -> {
            final LocalDate birthDate = person.getBirthDate();
            final LocalDate now = LocalDate.now();
            return now.getYear() - birthDate.getYear() <= averageAge;
        }).collect(Collectors.toList());

        elders.forEach(System.out::println);
        yongOnes.forEach(System.out::println);


        final String s1 = list.stream().map(Person::getName).reduce((s, s2) -> s + s2).get();

        System.out.println(s1);

        Optional.of(new Person(1, "Ab", LocalDate.now())).ifPresent(person1 -> System.out.println(person1));
    }

}
