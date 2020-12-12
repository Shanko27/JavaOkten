package Les3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Triangel extends GeometricFigure{

    private int a;
    private int b;
    private int c;


    @Override
    public int calculatePerimeter() {

        return a + b + c;
    }

    @Override
    public int calculateSquare() {

        return a * b * a/c;
    }

    @Override
    public void paint() {
        System.out.println("Triandel is painted");

    }

    @Override
    public void method() {

    }
}
