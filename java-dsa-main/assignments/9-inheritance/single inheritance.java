class Vehicle{
    Vehicle(){
         System.out.println("This is a Vehicle");
    }
}
class car extends Vehicle{
    car(){
         System.out.println("This is a Car");
    }
}
public class Main {
    public static void main(String[] args){
        car obj = new car();
    }
}
