package Les1;

public class User {
    private long id;
    private  int age;
    private String name;
    private  double weight;
    private  boolean status;

    public User (){
    }

    public User(long id, int age, String name, double weight, boolean status) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.weight = weight;
        this.status = status;
    }

    public User(long id, int age) {
        this.id = id;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", status=" + status +
                '}';
    }
    public String greeting(String msg){
        return msg + " my name is " + this.name + ", and i " + this.age + " old";
    }
    public int rec(int n){
        int num1 = n / 100;
        int num2 = (n % 100) /10;
        int num3 = n % 10;

        return (num3*100 + num2*10 + num1);
    }
}
