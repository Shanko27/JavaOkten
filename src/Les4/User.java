package Les4;

public class User<I> {

    private I id;

    public User(I id) {
        this.id = id;
    }

    public I getId() {
        return id;
    }

    //    public void print(int a){
//        System.out.println(a);
//    }
//
//    public void print(String b){
//        System.out.println(b);
//    }
//
//    public void print(Object c){
//        System.out.println(c);
//    }
    public <T> void print(T z) {
        System.out.println(z);
    }
}
