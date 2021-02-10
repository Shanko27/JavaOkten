package dz6;


import lombok.*;

import java.time.Duration;
import java.time.LocalTime;

@NoArgsConstructor
@EqualsAndHashCode
@Getter
@ToString

public class Seance implements Comparable<Seance> {
    private Movie movie;
    private Time start;
    private Time end;

    public LocalTime stTime() {
        LocalTime startT = LocalTime.of(start.getHour(), start.getMin());
        return startT;
    }


    public LocalTime enTime() {

        LocalTime durationT = LocalTime.of(movie.getDuration().getHour(), movie.getDuration().getMin());
        LocalTime mEndTime = stTime().plusMinutes(durationT.getMinute());
        LocalTime endTime = mEndTime.plusHours(durationT.getHour());
        return endTime;

    }


    public Seance(Movie movie, Time start, Time end) {
        this.movie = movie;
        this.start = start;
        this.setEnd();
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public void setStart(Time start) {
        this.start = start;
    }

    public void setEnd() {
        this.end = new Time(enTime().getHour(), enTime().getMinute());
    }

    @Override
    public int compareTo(Seance o) {
        int time = this.stTime().compareTo(o.stTime());
        if (time != 0) {
            return time;
        }
        return 0;
    }
}
