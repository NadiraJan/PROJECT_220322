package be.intecbrussel;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {

        Car car = new Car(4, true, 0);
        System.out.println("Car is driving");
        Scanner kbd = new Scanner(System.in);
        System.out.println("enter a number: ");
        String input = kbd.next();

        try {
            int radioStation = Integer.parseInt(input);
            car.setRadioStation(radioStation);

        } catch (NumberFormatException exception) {
            car.setRadioStation(5);
            exception.printStackTrace();
        } catch (ArithmeticException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("Run this code anyway");// Zeer handig
            System.out.println("closing stuff");
            kbd.close(); // close met scanner op veilige manier
        }
        try {
            car.setNumberOfWheels(5);
        } catch (Exception exception) {
            exception.printStackTrace();
           // System.out.println("wheel issue");
        }
        System.out.println("car is driving");

    }

}
//RESULT: Car is driving
//enter a number:
//5
//Run this code anyway
//closing stuff
//car is driving
//be.intecbrussel.MyExceptions: Too many Wheels
//	at be.intecbrussel.Car.setNumberOfWheels(Car.java:21)
//	at be.intecbrussel.App.main(App.java:27)


/* IN DE CLASS CAR :
 public void setNumberOfWheels(int numberOfWheels) throws Exception {
        if (numberOfWheels<4)throw new Exception("Too few wheels for a car");

        if(numberOfWheels>4)throw new MyExceptions("Too many Wheels");
        this.numberOfWheels = numberOfWheels;
    }*/

