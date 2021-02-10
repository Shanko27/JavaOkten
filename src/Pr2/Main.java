package Pr2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Popelushka> popelushkas = new ArrayList<>();
        popelushkas.add(new Popelushka("aza", 21, 38));
        popelushkas.add(new Popelushka("vaza", 29, 37));
        popelushkas.add(new Popelushka("rena", 26, 39));
        popelushkas.add(new Popelushka("rama", 22, 36));
        popelushkas.add(new Popelushka("dama", 44, 40));

        Princ princ = new Princ(40);

        for (Popelushka pop : popelushkas) {
            if (pop.getSize() == princ.getShoe()) {
                System.out.println(pop.getName() + " you win!!!");
            }
        }
    }
}
