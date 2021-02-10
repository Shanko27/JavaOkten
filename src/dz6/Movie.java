package dz6;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Movie {
    private String title;
    private Time duration;
//public LocalTime of() {
//    LocalTime of = LocalTime.of(this.duration.getHour(), this.duration.getMin());
//return of;
//}
}
