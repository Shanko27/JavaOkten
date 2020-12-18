package Pr4;

public enum Seasons {
SUMMER("Лето",30){
    @Override
    public void temperatuta() {
        System.out.println(this.getName() + this.getTemp() + " Жаркое время года");
    }
},
    WINTER("Зима",-20){
        @Override
        public void temperatuta() {
            System.out.println(this.getName() + this.getTemp() + " Холодное время года");
        }
    },
    AUTUMN("Осень",10){
        @Override
        public void temperatuta() {
            System.out.println(this.name() + this.getTemp() + "Среднее время года");
        }
    },
    SPRING("Весна",15){
        @Override
        public void temperatuta() {
            System.out.println(this.getName() + this.getTemp() + "Среднее время года");
        }
    };
    private String name;
private int temp;

public abstract void temperatuta();

    Seasons(String name, int temp) {
        this.name = name;
        this.temp = temp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "Seasons{" +
                "name='" + name + '\'' +
                ", temp=" + temp +
                '}';
    }
}
