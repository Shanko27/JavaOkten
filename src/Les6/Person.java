package Les6;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Person implements Comparable<Person> {

    private int id;
    private String name;
    private LocalDate birthDate;


    @Override
    public int compareTo(Person o) {
        int compareId = this.id - o.getId();
        int compareName = this.name.compareTo(o.getName());
        int compareDate = this.birthDate.compareTo(o.getBirthDate());

        if (compareId != 0) {
            return compareId;
        } else if (compareName != 0) {
            return compareName;
        } else return compareDate;
    }
}
