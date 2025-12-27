import java.util.Scanner;

public class Showroom implements utility {
    String showroom_Name;
    String showroom_address;
    int total_employees;
    int total_cars_in_stock = 0;
    String manager_name;

    @Override
    public void get_details() {
        System.out.println("Showroom Name: " + showroom_Name);
        System.out.println("Showroom Address: " + showroom_address);
        System.out.println("Total Employees: " + total_employees);
        System.out.println("Total Cars in Stock: " + total_cars_in_stock);
        System.out.println("Manager Name: " + manager_name);
    }

    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("======================= ENTER SHOWROOM DETAILS =========================");
        System.out.print("Showroom Name: ");
        showroom_Name = sc.nextLine();
        System.out.print("Showroom Address: ");
        showroom_address = sc.nextLine();
        System.out.print("Total number of Employees: ");
        total_employees = sc.nextInt();
        System.out.print("Total number of cars: ");
        total_cars_in_stock = sc.nextInt();
        sc.nextLine(); // Consume newline left-over
        System.out.print("Manager Name: ");
        manager_name = sc.nextLine();
    }
}