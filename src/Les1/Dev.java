package Les1;
import java.util.Arrays;

public class Dev {
    private String name;
    private String skills[];

    public Dev() {
    }

    public Dev(String name, String[] skills) {
        this.name = name;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Dev{" +
                "name='" + name + '\'' +
                ", skills=" + Arrays.toString(skills) +
                '}';
    }
}

