package Les7;

import Les6.Person;

@FunctionalInterface
public interface MyPredicate {

    boolean test(Person person);
}
