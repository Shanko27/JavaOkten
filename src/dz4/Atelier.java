package dz4;

import java.util.ArrayList;
import java.util.List;

public class Atelier {

    T_shirt t_shirt1 = new T_shirt(Size.XL, 400, "Black");
    T_shirt t_shirt2 = new T_shirt(Size.S, 300, "Red");
    Dress dress1 = new Dress(Size.M, 500, "Yellow");
    Dress dress2 = new Dress(Size.S, 700, "White");
    Pants pants1 = new Pants(Size.XXL, 1500, "Black");
    Pants pants2 = new Pants(Size.L, 1700, "Green");
    Tie tie1 = new Tie(Size.S, 100, "Black");
    Tie tie2 = new Tie(Size.M, 150, "White");

    Clothing[] clothing = new Clothing[]{
            t_shirt1, t_shirt2, dress1, dress2, pants1, pants2, tie1, tie2
    };


}