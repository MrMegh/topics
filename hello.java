// This is example of am AI in JAVA
import java.util.Scanner;

 class Main {
  public static void main (String args[]){
      Scanner sc = new Scanner (System.in);
     System.out.println("Hello , What is your name my name . My name is AI by XUIU to assit you ");
    String name =sc.nextLine();
    System.out.println("Hello "+name+" , welcome how are you today . You can command me to calculate or a joke or today weather (Not functioning good yet )");
    resp ob = new resp ();
    ob.res();
  }
}
class resp {
  void res(){
    Scanner sc = new Scanner (System.in);
    for (int i =0;i<20;i++){
       String in =sc.nextLine();
       if(in.equals("weather")&&in.equals("Weather")){
          System.out.println("The weather is 23 at you place ");
        }
        else System.out.println("NO mood");
    }
    
  }
}
