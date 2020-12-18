package dz4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class T_shirt extends Clothing implements MenClothing, WomenClothing {

    public T_shirt() {
    }

    public T_shirt(Size size, int price, String color) {
        super(size, price, color);
    }


    @Override
    public void dressMen() {

    }

    @Override
    public void dressWomen() {

    }
}
