import java.util.Scanner;

interface utility {
    void get_details();
    void set_details();
}

public class Main {
    static void main_menu() {
        System.out.println("\n==================== CAR SHOWROOM MANAGEMENT SYSTEM ====================");
        System.out.println("1] ADD SHOWROOM      2] ADD EMPLOYEE      3] ADD CAR");
        System.out.println("4] VIEW SHOWROOMS    5] VIEW EMPLOYEES    6] VIEW CARS");
        System.out.println("======================= ENTER 0 TO EXIT ================================");
        System.out.print("Choice: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Showroom[] showrooms = new Showroom[5];
        Employees[] employees = new Employees[5];
        Cars[] cars = new Cars[5];

        int showroom_count = 0, employee_count = 0, car_count = 0;
        int choice = -1;

        while (choice != 0) {
            main_menu();
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    showrooms[showroom_count] = new Showroom();
                    showrooms[showroom_count++].set_details();
                    break;
                case 2:
                    employees[employee_count] = new Employees();
                    employees[employee_count++].set_details();
                    break;
                case 3:
                    cars[car_count] = new Cars();
                    cars[car_count++].set_details();
                    break;
                case 4:
                    for (int i = 0; i < showroom_count; i++) {
                        showrooms[i].get_details();
                        System.out.println("---------------------------");
                    }
                    break;
                case 5:
                    for (int i = 0; i < employee_count; i++) {
                        employees[i].get_details();
                        System.out.println("---------------------------");
                    }
                    break;
                case 6:
                    for (int i = 0; i < car_count; i++) {
                        cars[i].get_details();
                        System.out.println("---------------------------");
                    }
                    break;
                case 0:
                    System.out.println("Exiting System...");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}