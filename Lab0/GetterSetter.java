import java.util.Scanner; 
public class GetterSetter {
    private static int Age;
    
    private static void setVariable(int x){
        Age=x;
    }
    
   private static int getterVariable(){
    return Age;
   }
   public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter Age");
    int temp=myObj.nextInt();
    setVariable(temp);
    System.err.println(getterVariable());
    myObj.close();
   }
}
