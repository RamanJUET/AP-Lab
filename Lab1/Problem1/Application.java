package Problem1;

class MotherClass {
    int x = 10;
    void show() {
        System.out.println("Value of x in Mother: " + x);
    }
}
class ChildClass extends MotherClass {
}

public class Application {
    public static void main(String[] args) {
        MotherClass MotherObj = new MotherClass();
        MotherObj.show(); 
        ChildClass ChildObj = new ChildClass();
        ChildObj.show();
    }
}
