package Les1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("dsdsd");
        User max = new User();
        max.setId(0);
        max.setAge(22);
        max.setName("Max");
        max.setStatus(true);
        max.setWeight(99.2);

        System.out.println(max);

        User kolia = new User(1, 33, "kolia", 88.8, true);
        System.out.println(kolia);

        User frukt = new User(2, 444);
        System.out.println(frukt);

        String meth = max.greeting("Hello ");
        System.out.println(meth);

        System.out.println(max.rec(213));


        String[] skills = {"html", "css"};

        Dev dev = new Dev("kos", skills);
        System.out.println(dev);

        ArrayList<String> skill = new ArrayList<>();
skill.add("html");
        skill.add("css");
        skill.add("java");
        Developer developer = new Developer("kolia", skill);

        developer.work();
    }
}