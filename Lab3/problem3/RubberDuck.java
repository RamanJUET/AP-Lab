package Lab3.problem3;

public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new CannotFly();
        quackBehavior = new Squeak();
    }
    
    public void display() {
        System.out.println("I'm a rubber duck");
    }
} 