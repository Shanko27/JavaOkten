package Les3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static final String CONST = "ssrv";
    public static void main(String[] args) {

Triangel triangel1 = new Triangel(1, 2, 3);
        Triangel triangel2 = new Triangel(5, 4, 3);
    Square square1 = new Square(4);
    Square square2 = new Square(2);


   final int sq1 = triangel1.calculateSquare();
        final int sq2 = triangel2.calculateSquare();
        final int sq3 = square1.calculateSquare();
        final int sq4 = square2.calculateSquare();

        Triangel[] triangels = new Triangel[] {triangel1, triangel2 };
        Square[] squares = new Square[] {square1, square2};

        int tt = 0;
        int ss = 0;

        for (Triangel triangel : triangels) {
           tt += triangel.calculateSquare();
        }
        for (Square square : squares) {
          ss +=  square.calculateSquare();
        }
        System.out.println(tt + ss);

        int tr = 0;
        List<GeometricFigure> figures = new ArrayList<>();
        figures.add(triangel1);
        figures.add(triangel2);
        figures.add(square1);
        figures.add(square2);

        for (GeometricFigure figure : figures) {
            tr += figure.calculateSquare();
            figure.paint();
        }
        System.out.println(tr);
    }
}
