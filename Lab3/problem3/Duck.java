package Lab3.problem3;

public abstract class Duck {
    protected Flyable flyBehavior;
    protected Quackable quackBehavior;
    
    public void swim() {
        System.out.println("Swimming in the water!");
    }
    
    public void performFly() {
        flyBehavior.fly();
    }
    
    public void performQuack() {
        quackBehavior.makeSound();
    }
    
    public void setFlyBehavior(Flyable fb) {
        flyBehavior = fb;
    }
    
    public void setQuackBehavior(Quackable qb) {
        quackBehavior = qb;
        
    }
} 