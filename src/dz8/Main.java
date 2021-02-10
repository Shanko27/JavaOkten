
//Доповнення до попередніх завдань зооклуб або кінотеатр.
//        Заповнити текстовий файл необхідними даними (можна і вручну),
//        і при запуску програми зчитати вміст файлу,
//        розпарсити дані і створити відповідні об'єкти зооклубу чи кінотеатру

package dz8;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        File file1 = new File("person.txt");
        File file2 = new File("animal.txt");

        List<String> list = new ArrayList<>();
        Person person1 = new Person();
        Person person2 = new Person();
        Animal animal1 = new Animal();
        Animal animal2 = new Animal();
        Animal animal3 = new Animal();
        Animal animal4 = new Animal();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file1))) {
            String s;
            while ((s = bufferedReader.readLine()) != null) {
                list.add(s);
            }
            myMethP(person1, list.get(0));
            myMethP(person2, list.get(1));
            System.out.println(person1);
            System.out.println(person2);

        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file2))) {
            String s;
            while ((s = bufferedReader.readLine()) != null) {
                list.add(s);
            }
            myMethA(animal1, list.get(0));
            myMethA(animal2, list.get(1));
            myMethA(animal3, list.get(2));
            myMethA(animal4, list.get(3));
            System.out.println(animal1);
            System.out.println(animal2);
            System.out.println(animal3);
            System.out.println(animal4);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static void myMethP(Person person, String s1) {

        String[] spl = s1.split(" ");
        for (int i = 0; i < spl.length; i++) {
            if (i == 0) {
                person.setId(Integer.parseInt(spl[i]));
            }
            if (i == 1) {
                person.setName(spl[i]);
            }
            if (i == 2) {
                person.setAge(Integer.parseInt(spl[i]));
            }
            if (i == 3) {
                person.setBirthdate(LocalDate.parse(spl[i]));
            }
            if (i == 4) {
                person.setSity(spl[i]);
            }

        }
    }

    private static void myMethA(Animal animal, String s1) {

        String[] spl = s1.split(" ");
        for (int i = 0; i < spl.length; i++) {
            if (i == 0) {
                animal.setId(Integer.parseInt(spl[i]));
            }
            if (i == 1) {
                animal.setName(spl[i]);
            }
            if (i == 2) {
                animal.setClas(spl[i]);
            }
        }

    }

}
