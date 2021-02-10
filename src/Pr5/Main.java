package Pr5;
//Створити клас Зооклуб. В цьому класі створити одне поле: private Map <Person, List <Pet>> club;
//        В мейн методі створити меню, яке буде реалізовувати наступні функції:
//        1) додати учасника в клуб;
//        2) додати тваринку до учасника клубу.
//        3) видалити тваринку з власника.
//        4) видалити учасника клубу.
//        5) видалити конкретну тваринку з усіх власників.
//        6) вивести на екран зооклуб.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ZooClub zooClub = new ZooClub();

        List<Person> persons = new ArrayList<>();
        {
            persons.add(new Person(1, "Vasia", 33, "Kiev"));
            persons.add(new Person(2, "Kolia", 22, "Odesa"));
            persons.add(new Person(3, "Igor", 20, "Poltava"));
            persons.add(new Person(4, "Olga", 23, "Lviv"));
            persons.add(new Person(5, "Sara", 43, "Dnipro"));
        }

        List<Pet> pets1 = new ArrayList<>();
        {
            pets1.add(new Pet(1, "Sharick", "cat"));
            pets1.add(new Pet(2, "Masia", "dog"));

        }
        List<Pet> pets2 = new ArrayList<>();
        {

            pets2.add(new Pet(1, "Dusia", "cat"));
            pets2.add(new Pet(2, "Bob", "squirrel"));
        }
        List<Pet> pets3 = new ArrayList<>();
        {
            pets3.add(new Pet(1, "Duzia", "cat"));
            pets3.add(new Pet(2, "Mur", "dog"));
        }

        List<Pet> pets4 = new ArrayList<>();
        {
            pets4.add(new Pet(1, "Gluk", "cat"));
            pets4.add(new Pet(2, "Dex", "dog"));

        }
        List<Pet> pets5 = new ArrayList<>();
        {
            pets5.add(new Pet(1, "Sharch", "cat"));
            pets5.add(new Pet(2, "Mas", "dog"));

        }

//zooClub.setClub(new Person(1, "Vasia", 33, "Kiev"),pets1);
        zooClub.getClub().put(persons.get(0), pets1);
        zooClub.getClub().put(persons.get(1), pets2);
        zooClub.getClub().put(persons.get(2), pets3);
        zooClub.getClub().put(persons.get(3), pets5);
        zooClub.getClub().put(persons.get(4), pets4);


        zooClub.getClub().remove(persons.get(1), pets2);
        zooClub.getClub().remove(persons.get(2));
        System.out.println(zooClub.getClub());
    }


}
