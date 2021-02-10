package Les9;

public class MyThraedEx extends Thread {

    private String who;

    public MyThraedEx(String name, String who) {
        super(name);
        this.who = who;
    }

    @Override
    public void run() {
        System.out.println(who);
        Runnable runnable = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(this.getName() + ": " + i);
            }
        };
    }
}
