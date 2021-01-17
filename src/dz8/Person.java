package dz8;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.File;
import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Person {
    int id;
    String name;
    int age;
    LocalDate birthdate;
    String sity;




}
