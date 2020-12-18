package dz4;

public class Dress extends Clothing implements WomenClothing {
    public Dress() {
    }

    public Dress(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWomen() {

    }
}
