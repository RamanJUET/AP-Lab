package Lab4.Problem1;

public class Eager {
    private static Eager instance = new Eager();
    private Eager(){}
    public static Eager getInstance(){
        return instance;
    }
}
