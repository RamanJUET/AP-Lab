class Voice{
    Animal[] animal = new Animal[5];
    public void prepareVoice(){
    
    animal[0]=new Cow();
    animal[1]=new Goat();
    animal[2]=new Lion();
    animal[3]=new Dog();
    animal[4]=new Pig();
    
    hear();
    }
    
    public void hear(){
        for(int i=0;i<5; i++){
            animal[i].makeVoice();
        } 
    }
    
}