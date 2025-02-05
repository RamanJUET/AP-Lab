package Lab3.problem3;

public class CannotFly implements Flyable {
    @Override
    public void fly() {
        System.out.println("Sorry, I cannot fly!");
    }
} 