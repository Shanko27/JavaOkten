package dz4;

public class Pants extends Clothing implements MenClothing, WomenClothing {

    public Pants() {
    }

    public Pants(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMen() {

    }

    @Override
    public void dressWomen() {

    }
}
