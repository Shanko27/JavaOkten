package dz6;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
import java.util.TreeSet;

@Data
public class Schedule {

    private Set<Seance> seance;

    public Schedule() {
        this.seance = new TreeSet<>();

    }

    public void addSeance(Seance sean) {
        seance.add(sean);

    }

    public void removeSeance(Seance sean) {
        seance.remove(sean);
    }

}
