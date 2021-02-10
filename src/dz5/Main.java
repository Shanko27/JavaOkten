package dz5;
//Створити клас Product (назва, ціна, тип (для цього можете створити енум) і ще 1-3 поля за власним бажанням).
// Приватні поля, гетери-сетери, констркутор, туСтрінг, equals&hashcode.
//        Створити клас Store, який матиме поле - List продуктів.
//        Конструктор класу store не має жодних параметрів, в тілі просто ініціалізує List (new ArrayList<>).
//        В класі Store створити, і в мейні викликати, наступні методи:
//        1. Додати продукт в магазин.
//        Але перш ніж додати його в ліст, здійснити валідацію
//        (чи ціна не від'ємна, чи в назві товару не присутні цифри).
//        2. Видалити продукт з магазину по назві.
//        3. Збільшити ціну для вказаного у параметрі типу продуктів удвічі
//        4. Усі товари, дорожчі вказаної суми, записати у окремий ліст і вивести його на екран
//        (наприклад "В нашому магазині продаються такі преміум товари:...)
//        5. Порахувати загальну суму усіх товарів вказаного у вхідному параметрі типу і вивести її на екран
//        6. Порахувати середню вартість усіх товарів в магазині і вивести це число на екран
//
//        Для роботи з колекцією варто ще створити метод,
//        який наповнить наш магазин одразу же ж певною кількістю продуктів


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        Product[] products = new Product[]{new Product(1, "Rolex", 5000, Enum.CLOCK),
                new Product(2, "Casio", 400, Enum.CLOCK),
                new Product(3, "Dell", 6000, Enum.MONITOR),
                new Product(4, "Lenovo", 4000, Enum.MONITOR),
                new Product(5, "Samsung", 7000, Enum.PHONE),
                new Product(6, "Nokia", 300, Enum.PHONE),
                new Product(7, "Bear", 50, Enum.TOY),
                new Product(8, "Mouse", 120, Enum.TOY)};

        for (Product product : products) {
            store.addProduct(product);
        }
        System.out.println(store.prod);

        for (Product product : products) {
            store.del(product, "Lenovo");
        }
        System.out.println(store.prod);

        for (Product product : products) {
            store.up(product, "Clock");
        }
        System.out.println(store.prod);

        for (Product product : products) {
            store.newArr(product, 3000);
        }
        System.out.println(store.prod);
        System.out.println("Top product " + store.topProd);


        for (Product product : products) {
            store.sum(product, "TOY");
        }
        System.out.println(store.s);

        for (Product product : products) {
            store.avgProd(product);
        }
        System.out.println(store.z);

    }
}
