package Lab3.problem3;

public class LakeDuck extends Duck {
    public LakeDuck() {
        flyBehavior = new CanFly();
        quackBehavior = new Quack();
    }
    
} 