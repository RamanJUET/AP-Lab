package Lab3.problem3;

public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        flyBehavior = new CanFly();
        quackBehavior = new Quack();
        
    }
} 