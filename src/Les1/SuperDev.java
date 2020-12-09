package Les1;

import java.util.ArrayList;

public class SuperDev extends Developer{
    private int age;
    public SuperDev() {
    }

    public SuperDev(String name, ArrayList<String> skills, int age) {
        super(name, skills);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "SuperDev{" +
                "age=" + age +
                '}';
    }
}
