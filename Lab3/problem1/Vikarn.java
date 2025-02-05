package Lab3.problem1;
public class Vikarn extends Kaurav {
    // Vikarn overrides Kaurav traits since he's noble
    @Override
    public void obey() {
        System.out.println("I am obedient");
    }
    
    @Override
    public void kind() {
        System.out.println("I am kind");
    }
} 