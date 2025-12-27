import java.util.Scanner;
import java.util.UUID;

public class Employees extends Showroom implements utility {
    String emp_id;
    String emp_name;
    int emp_age;
    String emp_department;

    @Override
    public void get_details() {
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Employee Name: " + emp_name);
        System.out.println("Age: " + emp_age);
        System.out.println("Department: " + emp_department);
        System.out.println("Working at Showroom: " + showroom_Name);
    }

    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);
        emp_id = UUID.randomUUID().toString().substring(0, 8); // Shorter UUID
        System.out.println("======================= ENTER EMPLOYEE DETAILS =======================");
        System.out.print("Employee Name: ");
        emp_name = sc.nextLine();
        System.out.print("Employee Age: ");
        emp_age = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Employee Department: ");
        emp_department = sc.nextLine();
        System.out.print("Showroom Name: ");
        showroom_Name = sc.nextLine();
    }
}