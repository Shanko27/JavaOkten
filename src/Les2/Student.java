package Les2;

import lombok.*;

@NoArgsConstructor
@Getter

@Setter
public class Student extends Person {
    private String group;

    public Student(int id, String name, String group) {
        super(id, name);
        this.group = group;
    }

    @Override
    public String toString() {
        return super.toString() + " " + "Student{" +
                "group='" + group + '\'' +
                '}';
    }

    @Override
    public void saySmth(String smth) {
        System.out.println("bla");
        super.saySmth(smth);
    }

    public void session() {
        System.out.println("i now");
    }
}

