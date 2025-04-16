package DesignPattern.Adapter;

public class Crowadapter implements swan{
    private IndianCrow CrowObj;
    public Crowadapter(IndianCrow TempCrow){
        this.CrowObj=TempCrow;
    }
    @Override
    public void Sing() {
        CrowObj.cry();
    }
    @Override
    public void eat() {
        CrowObj.eat();
    }
    @Override
    public void Swim() {
        CrowObj.fly();
    }
}
