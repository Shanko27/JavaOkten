package dz6;

import lombok.*;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@ToString
public class Cinema {

  private TreeMap<Days, Schedule> mDS;
   private Time open;
    private Time close;

    public Cinema(Time open, Time close) {
        this.mDS = new TreeMap<>();
        this.open = open;
        this.close = close;
    }

    public void setmDS(TreeMap<Days, Schedule> mDS) {
        this.mDS = mDS;
    }

    public void setOpen(Time open) {

        if (open.getHour() <10) {
            System.out.println("error");
        }
        this.open = open;
    }

    public void setClose(Time close) {
        if (close.getHour() >23) {
            System.out.println("error");
        }

        this.close = close;
    }

    public void addSeances (Schedule s, Days day, Seance ...seances){

        for (Seance seance : seances) {
            s.addSeance(seance);
        } mDS.put(day, s);


    }


    public void addSeance ( Seance seance, Days day){
Set<Days> set = mDS.keySet();
        for (Days sz : set) {
            if (day == sz) {
                mDS.get(sz).getSeance().add(seance);
            }}}

    public void removeMovie(Movie movie) {
        Set<Days> set = mDS.keySet();

        for (Days s : set) {
            for (Seance seance1 : mDS.get(s).getSeance()) {
                if (seance1.getMovie() == movie) {
                    mDS.get(s).removeSeance(seance1);
                }}}}

    public void removeSeance( Seance seance, Days day){
        Set<Days> set = mDS.keySet();
        for (Days s : set) {
            if (day == s) {
                mDS.get(s).getSeance().remove(seance);
            }}}
}
