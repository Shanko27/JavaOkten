package Les5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        list.add("second");
        System.out.println(list.set(3, "fourth"));
        System.out.println(list);

        String[] ar = new String[]{"first", "second"};
        String[] ar1 = new String[]{"first", "second"};
        final List<String[]> strings = Arrays.asList(ar, ar1);
        System.out.println(strings);

        String s1 = "Hello";
        String s2 = "Hello";

        Person p1 = new Person(1, "Taras");
        Person p2 = new Person(1, "Taras");


        System.out.println(s1.equals(s2));
        System.out.println(p1.equals(p2));

        List<Person> list1 = new ArrayList<>();
        list1.add(new Person(1, "Taras"));
        list1.add(new Person(2, "Igor"));
        list1.add(new Person(3, "Anna"));

        for (Person person : list1) {
            if (person.getName().startsWith("I")) {
                list.remove(person);
            }
        }
        Iterator<Person> itera = list1.iterator();
        while (itera.hasNext()) {
            Person p = itera.next();
            itera.remove();
        }
        System.out.println(list1);

        Set<Person> set = new HashSet<>();
        set.add(new Person(1, "Olena"));
        set.add(new Person(2, "Volodymer"));
        set.add(new Person(3, "Roman"));
        set.add(new Person(4, "Serhiy"));
        set.add(new Person(2, "Volodymer"));

        System.out.println(set);


        Map<String, Person> map = new HashMap<>();
        map.put("first", new Person(1, "Olena"));
        map.put("second", new Person(2, "Igor"));
        map.put("first", new Person(3, "Roman"));

        System.out.println(map);


    }
}
