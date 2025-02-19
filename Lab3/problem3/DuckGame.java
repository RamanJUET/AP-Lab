package Lab3.problem3;

public class DuckGame {
    public static void main(String[] args) {
        RubberDuck rubberDuck = new RubberDuck();
        WoodenDuck woodenDuck = new WoodenDuck();
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        LakeDuck lakeDuck = new LakeDuck();
        

        System.out.println("Rubber Duck:");
        rubberDuck.performQuack();
        rubberDuck.performFly();
        rubberDuck.swim();
        
        System.out.println("\nWooden Duck:");
        woodenDuck.performQuack();
        woodenDuck.performFly();
        woodenDuck.swim();
        
        System.out.println("\nRedHead Duck:");
        redHeadDuck.performQuack();
        redHeadDuck.performFly();
        redHeadDuck.swim();
        
        System.out.println("\nLake Duck:");
        lakeDuck.performQuack();
        lakeDuck.performFly();
        lakeDuck.swim();
        
    }
} 