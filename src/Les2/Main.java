package Les2;

public class Main {
    public static void main(String[] args) {

        Person p = new Person();
        Student s = new Student();
Person p1 = new Student(1,"nazar","cs");
Student s1 = (Student) p1;

s.saySmth("bla");
        System.out.println(p.combine());
        System.out.println(s1);
        System.out.println(p1);

        ForStatic forStatic = new ForStatic();
        forStatic.a = 10;
   ForStatic.staticA = 11;
        ForStatic forStatic1 = new ForStatic();
        forStatic1.a = 11;



    }
}
