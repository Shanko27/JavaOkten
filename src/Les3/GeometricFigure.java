package Les3;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public abstract class GeometricFigure implements Paintable{

private int perimeter;
private int square;

public abstract int calculatePerimeter();

    public abstract int calculateSquare();


}
