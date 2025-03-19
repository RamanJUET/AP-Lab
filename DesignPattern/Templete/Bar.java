
public class Bar {
    public static void main(String[] args) {
        Beer beer=new Beer();
        whisky Whisky=new whisky();
        Rum rum=new Rum();
        System.out.println("--------------------------------------");
        beer.MakeDrink(160,"bear"); 
        System.out.println("--------------------------------------");
        Whisky.MakeDrink(30, "Whisky");
        System.out.println("--------------------------------------");
        rum.MakeDrink(60, "Rum");
    }
}
