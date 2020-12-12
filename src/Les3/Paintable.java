package Les3;

public interface Paintable {

    int A = 4;
    void paint();

    default void method(){
        System.out.println("Default");
    }
}
