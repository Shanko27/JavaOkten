//Даний проект має такі сутності: Days, Time, Movie, Seance, Schedule, Cinema.
//enum Days:
//        - прописати дні тижня;
//        Time:
//        - int min, int hour;
//        - передбачити межі для цих полів (для min 0..59, для hour 0..23);
//        Movie:
//        - String title, Time duration (або ж можете забити на власний Time і використати java.time.Duration, як і тут,
//        так і в інших класах. це за власним бажанням)
//        Seance:
//        - Movie movie, Time startTime, Time endTime;
//        - в конструктор має надходити параметрами значення для перших двох полів,
//        третє поле повинне обчислюватись (start + duration);
//        Schedule:
//        - TreeSet <Seance> (в полі пишемо Set <Seance>, а в конструкторі вже =new TreeSet <Seance>() );
//        - Сортування по startTime.
//        - методи: addSeance (Seance), removeSeance (Seance);
//        Cinema:
//        - TreeMap<Days, Schedule>, Time open, Time close;
//        - врахувати час відкриття і закриття при формуванні сеансів!
//        - методи: addSeances (String day, Seance...seance) (додає набір сеансів в конкретний день),
//        addSeance (Seance, String) (додає один сеанс в конкретний день),
//        removeMovie(Movie) (повністю видаляє усі сеанси вказаного фільму з розкладу),
//        removeSeance (Seance, String) (видаляє конкретний сеанс фільму в конкретний день,
//        який задається параметром String).
//
//        Main class:
//        - створення об'єкту Cinema;
//        - викликаємо всі методи Cinema
//
//        Для кожного класу зробити адекватний toString, щоб все було читабельно і доступно.
//        Там де потрібно, зробити compareTo(). Маєте якісь власні ідеї для розробки - будь-ласка.
//        Це моделювання роботи кінотеатру, тому все що наблизить програму до реальності вітається.

        package dz6;


import java.time.LocalTime;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {


    public static void main(String[] args) {

      Time sTime1 =  new Time(11,20);
        Time sTime2 =  new Time(12,30);
        Time sTime3 =  new Time(13,40);
        Time sTime4 =  new Time(14,50);
        Time sTime5 =  new Time(15,0);
        Time sTime6 =  new Time(16,10);
        Time sTime7 =  new Time(17,20);
        Time sTime8 =  new Time(66,66);
        Time oTime =  new Time(10,40);
        Time cTime =  new Time(20,50);


        Time duration1 =  new Time(1,0);
        Time duration2 =  new Time(1,0);
        Time duration3 =  new Time(1,0);
        Time duration4 =  new Time(1,0);
        Time duration5 =  new Time(1,0);
        Time duration6 =  new Time(1,0);
        Time duration7 =  new Time(1,0);
        Time duration8 =  new Time(1,0);
        Time duration9 =  new Time(1,0);
        Time duration0 =  new Time(1,0);


        Movie movie1 = new Movie("film1", duration1);
        Movie movie2 = new Movie("film2", duration2);
        Movie movie3 = new Movie("film3", duration3);
        Movie movie4 = new Movie("film4", duration4);
        Movie movie5 = new Movie("film5", duration5);


Seance seance1 = new Seance(movie1,sTime1,sTime1);
      Seance seance2 = new Seance(movie2,sTime2,sTime1);
      Seance seance3 = new Seance(movie3,sTime3,sTime1);
      Seance seance4 = new Seance(movie4,sTime4,sTime1);
        Seance seance5 = new Seance(movie5,sTime5,sTime1);


      Schedule schedule1 = new Schedule();
schedule1.addSeance(seance1);
      schedule1.addSeance(seance2);


//        System.out.println(schedule1);


        Cinema cinema = new Cinema(oTime,cTime);
        cinema.getMDS().put(Days.MONDAY,schedule1);

cinema.addSeances(schedule1, Days.MONDAY, seance3, seance4);

        System.out.println(cinema);
cinema.addSeance(seance5, Days.MONDAY);
        System.out.println(cinema);
        cinema.removeMovie(movie5);
        System.out.println(cinema);
        cinema.removeSeance(seance4,Days.MONDAY);
        System.out.println(cinema);
//Cinema cinema = new Cinema();
//Schedule schedule1 = new Schedule();
//
//
//schedule1.addSeance(new Seance(new Movie("film1",new Time(1,2)),new Time(1,2),new Time(1,2)));
////cinema.addSeances(Days.MONDAY,schedule1);
//
//        System.out.println(schedule1);

    }
}
