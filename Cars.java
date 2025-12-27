import java.util.Scanner;

public class Cars extends Showroom implements utility {
    String car_name;
    String car_colour;
    String car_fuel_type;
    int car_price;
    String car_type;
    String car_transmission;

    @Override
    public void get_details() {
        System.out.println("Car Name: " + car_name);
        System.out.println("Car Colour: " + car_colour);
        System.out.println("Fuel Type: " + car_fuel_type);
        System.out.println("Price: " + car_price);
        System.out.println("Type: " + car_type);
        System.out.println("Transmission: " + car_transmission);
    }

    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("====================== ENTER CAR DETAILS ==========================");
        System.out.print("Car Name: ");
        car_name = sc.nextLine();
        System.out.print("Car Colour: ");
        car_colour = sc.nextLine();
        System.out.print("Fuel Type: ");
        car_fuel_type = sc.nextLine();
        System.out.print("Car Price: ");
        car_price = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Car Type (SUV/Sedan/Hatchback): ");
        car_type = sc.nextLine();
        System.out.print("Car Transmission (Manual/Auto): ");
        car_transmission = sc.nextLine();
    }
}