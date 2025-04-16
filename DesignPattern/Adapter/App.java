package DesignPattern.Adapter;

public class App {
    public static void main(String[] args) {
        IndianCrow OurIndian=new IndianCrow();
        IndianSwan OurSwan=new IndianSwan();
        Crowadapter TempAdapter=new Crowadapter(OurIndian);
        TempAdapter.Sing();
        TempAdapter.Swim();
        TempAdapter.eat();
        OurSwan.Sing();
        OurSwan.Swim();
        OurSwan.eat();
    }
}
