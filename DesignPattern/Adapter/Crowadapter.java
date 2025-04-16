package DesignPattern.Adapter;

public class Crowadapter implements swan{
    private IndianCrow CrowObj;
    public Crowadapter(IndianCrow TempCrow){
        this.CrowObj=TempCrow;
    }
    @Override
    public void Sing() {
        this.CrowObj.cry();
    }
    @Override
    public void eat() {
        this.CrowObj.eat();
    }
    @Override
    public void Swim() {
        this.CrowObj.fly();
    }
}