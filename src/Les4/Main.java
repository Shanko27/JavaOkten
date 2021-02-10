package Les4;

public class Main {
    public static void main(String[] args) {


        for (CarType carType : CarType.values()) {
            if (carType.getUkrainianTranslatoin().equals("hetchback")) {
                carType.setUkrainianTranslatoin("Хетчбек");
            }
            System.out.println(carType.getUkrainianTranslatoin());
            carType.paint();
        }

        Car car = new Car(new Engine(2, 4), "Audi", 32000, CarType.SEDAN);
        Car car1 = new Car(car.getEngine(), "Volkswagen", 30000, CarType.HATCHBACK);

        car.getEngine().setCylinderNumber(car.getEngine().getCylinderNumber() + 1);
        System.out.println(car);
        System.out.println(car1);
        car.getEngine().startEngine();
        car1.startCar();


        User<Integer> user = new User<>(1);
        System.out.println(user.getId());
        User<String> user1 = new User<>("Four");
        System.out.println(user1.getId());

//        user.print(1);
//        user.print("sasa");
    }
}
