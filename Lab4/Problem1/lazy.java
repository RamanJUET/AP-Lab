package Lab4.Problem1;

public class lazy {
    public static lazy instance;
    private lazy(){}
    public static lazy getInstance(){
        if(instance == null){
            instance = new lazy();
        }
        return instance;
    }
}
