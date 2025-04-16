package DesignPattern.Adapter;

public class IndianSwan implements swan{
    @Override
    public void Sing() {
        System.out.println("Swan singing");
    }
    @Override
    public void eat() {
        System.out.println("Easting fish");
    }
    @Override
    public void Swim() {
        System.out.println("Swimming in river");
    }
}
