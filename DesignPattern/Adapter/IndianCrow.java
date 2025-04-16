package DesignPattern.Adapter;

public class IndianCrow implements crow {
    @Override
    public void cry() {
        System.out.println("Caw");
    }
    @Override
    public void eat() {
        System.out.println("Bread");
    }
    @Override
    public void fly() {
        System.out.println("Fly above the building");
    }
}
