class MotherClass {
    public void show() {
        System.out.println("Hello World from mother class");
    }
}

class ChildClass extends MotherClass {
    @Override
    public void show() {
        System.out.println("Hello JUET from child class");
    }
}

public class Application {
    public static void main(String[] args) {
        MotherClass MotherObj = new MotherClass();
        MotherObj.show();

        ChildClass ChildObj = new ChildClass();
        ChildObj.show();
    }
}

