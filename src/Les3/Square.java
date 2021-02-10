package Les3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Square extends GeometricFigure {
    @Override
    public void paint() {
        System.out.println("Square is painted");
    }

    @Override
    public void method() {

    }

    private int a;

    @Override
    public int calculatePerimeter() {
        return a * 4;
    }

    @Override
    public int calculateSquare() {
        return a * a;
    }
}
