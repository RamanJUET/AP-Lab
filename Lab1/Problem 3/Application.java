// Static in Mother:
class MotherNonStatic {
    public static void show() {
        System.out.println("Hello World");
    }
}

class ChildNonStatic extends MotherNonStatic {
    @Override
    public void show() {
        System.out.println("Hello JUET");
    }
}

public class Application {
    public static void main(String[] args) {
        // Static in Mother:
        MotherNonStatic m1 = new ChildNonStatic();
        m1.show();

        MotherNonStatic motherObj = new MotherNonStatic();
        motherObj.show();

        ChildNonStatic childObj = new ChildNonStatic();
        childObj.show();


        //Static in Child:
        MotherNonStatic2 m11 = new ChildStatic();
        m11.show();

        MotherNonStatic2 motherObj1 = new MotherNonStatic2();
        motherObj1.show();

        ChildStatic childObj1 = new ChildStatic();
        childObj1.show();



        // Static in both Mother and Child:
        MotherStatic m12 = new ChildStatic2();
        m12.show();

        MotherStatic motherObj2 = new MotherStatic();
        motherObj2.show();

        ChildStatic2 childObj2 = new ChildStatic2();
        childObj2.show();
    }
}
//Static in Child:
class MotherNonStatic2 {
    public void show() {
        System.out.println("Hello World");
    }
}

class ChildStatic extends MotherNonStatic2 {
    public static void show() {
        System.out.println("Hello JUET");
    }
}




// Static in both Mother and Child:
class MotherStatic {
    public static void show() {
        System.out.println("Hello World");
    }
}

class ChildStatic2 extends MotherStatic {
    public static void show() {
        System.out.println("Hello JUET");
    }
}

