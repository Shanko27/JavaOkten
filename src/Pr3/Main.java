package Pr3;

import java.util.ArrayList;
import java.util.List;

//Создать интерфейс Инструмент и реализующие его классы Гитара, Барабан и Труба.
//        Интерфейс Инструмент содержит метод play() и переменную String KEY ="До мажор".
//        Гитара содержит переменные класса количествоСтрун,  Барабан - размер, Труба - диаметр.
//        Создать массив типа Инструмент, содержащий инструменты разного типа.
//        В цикле вызвать метод play() для каждого инструмента, который должен выводить строку
//        "Играет такой-то инструмент c такими то характеристиками".
public class Main {

    public static void main(String[] args) {


        List<Instrument> instruments = new ArrayList<>();

        instruments.add(new Gitar(5));
        instruments.add(new Dram("XL"));
        instruments.add(new Truba(6));

        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
