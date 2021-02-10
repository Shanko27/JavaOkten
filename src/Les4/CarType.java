package Les4;

import Les3.Paintable;

public enum CarType implements Paintable {
    SEDAN("sedan") {
        @Override
        public void paint() {
            System.out.println(this.getUkrainianTranslatoin() + "фарбуємо у білий колір");
        }
    },
    SUV("krosover") {
        @Override
        public void paint() {
            System.out.println(this.getUkrainianTranslatoin() + "фарбуємо у синій колір");
        }
    },
    HATCHBACK("hetchback") {
        @Override
        public void paint() {
            System.out.println(this.getUkrainianTranslatoin() + "фарбуємо у червоний колір");
        }
    };

    private String ukrainianTranslatoin;

    private CarType(String ukrainianTranslatoin) {
        this.ukrainianTranslatoin = ukrainianTranslatoin;
    }

    public String getUkrainianTranslatoin() {
        return ukrainianTranslatoin;
    }

    public void setUkrainianTranslatoin(String ukrainianTranslatoin) {
        this.ukrainianTranslatoin = ukrainianTranslatoin;
    }


    public abstract void paint();

    @Override
    public void method() {

    }
}
