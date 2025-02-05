package Lab3.problem3;


public class MuteQuack implements Quackable {
    @Override
    public void makeSound() {
        System.out.println("<<Silence>>");
    }
} 