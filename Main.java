import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //Generic Array list that can store objects of type Car
    private static final ArrayList<Car> newCar = new ArrayList<>();

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);



    while (true) {

     System.out.print("Enter the number of Cars or -1 to exit");
     int cr = sc.nextInt();
    //condition to exit the while loop
     if (cr == -1) {
         break;
     }

     System.out.print("Enter the Speed of Acceleration");
     int speed = sc.nextInt();

     System.out.print("Enter the Distance");
     int distance = sc.nextInt();

     //Create Object car of class Car
     Car car = new Car(cr, speed, distance);
     newCar.add(car); // add the object to the arraylist
     System.out.println("Car added Successfully");
 }

        // printout the content in the Arraylist
        System.out.println(newCar);

    }
}
//----------------------------Class or  Blueprint----------------------------------------------
class Car{
    int speed;
    int acceleration;
    int distance;

// constructor to initialize the object whenn its called or created
    public Car (int speed,int acceleration, int distance){
        this.speed = speed;
        this.acceleration = acceleration;
        this.distance = distance;
    }

    //helps the return the object stored in strings
    @Override
    public String toString() {
        //the UI of how the data is viewed when stored in the object
        return " Speed =" + speed + "acceleration = " + acceleration + "distance = " + distance;
    }
}
