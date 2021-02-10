package Les8;

public class MyException extends RuntimeException {

    private String veryDetailedMessrge;

    public MyException(String message, String veryDetailedMessrge) {
        super(message);
        this.veryDetailedMessrge = veryDetailedMessrge;
    }

    public String getVeryDetailedMessrge() {
        return veryDetailedMessrge;
    }
}
