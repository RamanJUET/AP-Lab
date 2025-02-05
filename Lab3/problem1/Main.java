package Lab3.problem1;
public class Main {
    public static void main(String[] args) {
        Arjun arjun = new Arjun();
        Bheem bheem = new Bheem();
        Duryodhan duryodhan = new Duryodhan();
        Vikarn vikarn = new Vikarn();
        
        // Test the behaviors
        arjun.fight();    // "I am a fighter"
        arjun.kind();     // "I am kind"
        bheem.kind();     // "I am somewhat kind"
        duryodhan.obey(); // "I am disobedient"
        vikarn.kind();    // "I am kind"
    }
} 