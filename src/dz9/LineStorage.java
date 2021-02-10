package dz9;


import lombok.Data;
import lombok.NoArgsConstructor;


@Data

public class LineStorage {
    private String str;
    private boolean bool;

    public LineStorage() {

        this.bool = true;
    }
}
