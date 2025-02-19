package Lab3.problem3;

public class WoodenDuck extends Duck {
    public WoodenDuck() {
        flyBehavior = new CannotFly();
        quackBehavior = new MuteQuack();
        
    }
} 