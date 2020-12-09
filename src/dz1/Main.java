package dz1;

public class Main {
    public static void main(String[] args) {
//        1. Створити 10 цілочисленних змінних
//        - додати їх між собою
//                - відняти їх між собою
//                - перемножити їх між собою
//                - поділити їх між собою
//        Вивести результати в консоль


        Int Int = new Int(1,2,3,4,5,6,7,8,9,10);
int add = Int.addition();
        System.out.println(add);
        int add1 = Int.subtraction();
        System.out.println(add1);
        int add2 = Int.multiplication();
        System.out.println(add2);
        int add3 = Int.division();
        System.out.println(add3);

//        2. Придумати речення з 10-12 слів. Кожне слово покласти в змінну. Вивести в консоль
//        ціле речення.

        Strin strin = new Strin("У ", "меня ", "была ", "собака ", "я ", "её ",
                                "любил ", "она ", "съела ", "кусок");
String z = strin.sentence();
        System.out.println(z);


//        3.Свторити клас User з полями
//        int id,
//        int age
//        String name,
//        String surname,
//        double weight,
//        double height.
//
//        Створити 10 об'єктів класу User.
//        Скласти між собою значення їх віку і вивести в консоль.
//        Скласти між собою значення їх ваги і вивести в консоль.
//        Скласти між собою значення їх зросту і вивести в консоль.
//
//        4. Зробити завдання 3, але 10 об'єктів покласти водин масив.
//        Скласти між собою значення їх віку і вивести в консоль.
//        Скласти між собою значення їх ваги і вивести в консоль.
//        Скласти між собою значення їх зросту і вивести в консоль.


        User c1 = new User(1, 33, "kolia", "molia", 52.5, 166.6);
        User c2 = new User(2, 20, "max", "dax", 62.5, 176.6);
        User c3 = new User(3, 21, "oleg", "void", 72.5, 186.6);
        User c4 = new User(4, 22, "serj", "spech", 82.5, 178.6);
        User c5 = new User(5, 25, "olia", "solo", 57.5, 160.6);
        User c6 = new User(6, 20, "valia", "dach", 66.5, 160.1);
        User c7 = new User(7, 42, "tolia", "varg", 78.4, 179.6);
        User c8 = new User(8, 29, "sasha", "solos", 79.3, 177.6);
        User c9 = new User(9, 31, "andrey", "midel", 78.2, 188.6);
        User c0 = new User(10, 32, "vetal", "mist", 99.1, 199.6);


        int a = c1.getAge() + c2.getAge() + c3.getAge() + c4.getAge() + c5.getAge() + c6.getAge() + c7.getAge() + c8.getAge() + c9.getAge() + c0.getAge();
        double b = c1.getWeight() + c2.getWeight() + c3.getWeight() + c4.getWeight() + c5.getWeight() + c6.getWeight() + c7.getWeight() + c8.getWeight() + c9.getWeight() + c0.getWeight();
        double c = c1.getHeight() + c2.getHeight() + c3.getHeight() + c4.getHeight() + c5.getHeight() + c6.getHeight() + c7.getHeight() + c8.getHeight() + c9.getHeight() + c0.getHeight();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        User[] d = new User[]{c1, c2, c3, c4, c5, c6, c7, c8, c9, c0};
int s = 0;
        double w = 0;
        double q = 0;
     for (User user:d){
         s += user.getAge();
     }
        for (User user:d){
            w += user.getWeight();
        }
        for (User user:d){
            q += user.getHeight();
        }
        System.out.println(s);
        System.out.println(w);
        System.out.println(q);

//        5.
//        Створити клас Car
//                - кінські сили (або потужність)
//                - об'єм двигуна
//                + 5 полів придумати самостійно
//
//        Створити 10 об'єктів класу Car.
//        Скласти між собою значення їх об'ємів і вивести в консоль.
//        Скласти між собою значення їх потужностей і вивести в консоль.
//
//        6.
//        Зробити завдання 5 , але 10 об'єктів покласти в масив.
//        Скласти між собою значення їх об'ємів і вивести в консоль.
//        Скласти між собою значення їх потужностей і вивести в консоль.




        Car v1 = new Car(625, 4.4, "bmv", "Germeni", 5, "dizel", 5);
        Car v2 = new Car(500, 5, "dodge", "USA", 4, "gas", 5);
        Car v3 = new Car(325, 3.2, "mersedes", "Germeni", 5, "dizel", 5);
        Car v4 = new Car(100, 1.2, "vaz", "Russia", 4, "gas", 5);
        Car v5 = new Car(124, 1.5, "zaz", "Ukraina", 3, "gas", 5);
        Car v6 = new Car(98, 1.1, "fiat", "Espana", 3, "gas", 5);
        Car v7 = new Car(300, 3, "mazda", "Japan", 5, "dizel", 5);
        Car v8 = new Car(234, 2.4, "toyota", "Japan", 5, "gas", 5);
        Car v9= new Car(123, 2, "renault", "France", 4, "dizel", 5);
        Car v0 = new Car(88, 1.4, "zaz", "Ukraina", 4, "gas", 5);


int rr = v1.getPower() + v2.getPower() + v3.getPower() + v4.getPower() + v5.getPower() + v6.getPower() + v7.getPower() + v8.getPower() + v9.getPower() + v0.getPower();
        double uu = v1.getEngine() + v2.getEngine() + v3.getEngine() + v4.getEngine() + v5.getEngine() + v6.getEngine() + v7.getEngine() + v8.getEngine() + v9.getEngine() + v0.getEngine();
        System.out.println(rr);
        System.out.println(uu);

        Car[] zz = new Car[]{v1, v2, v3, v4, v5, v6, v7, v8, v9, v0};
int cc = 0;
double ss = 0;
for (Car ww: zz){
    cc+=ww.power;
}
        System.out.println(cc);
        for (Car ee: zz){
            ss+=ee.Engine;
        }
        System.out.println(ss);



//        7. За допомоги %, спробувати "реверснути" трьохзначне число. Приклад 412 => 214
        User rever = new User();
        System.out.println(rever.rec(345));
    }
}
