package employee;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
    public String name, email;
    public int hourRate, capacity, freeDays;

    public Employee(String name, String email, int hourRate, int capacity, int freeDays){

    }

    public int calculateDailyIncome(){
        return capacity*hourRate;

    }
    public int calculateMonthlyIncome() {
        return 20-freeDays*calculateDailyIncome();

    }
 public static void main(String[] args){
     ArrayList<Employee> employeeList = new ArrayList<Employee>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti nr de angajati: ");
        int nr = scanner.nextInt();

        for(int i=1;i<=nr;i++){
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Introduceti numele: ");
            String name = scanner.nextLine();

            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Introduceti emailul: ");
            String email = scanner.nextLine();

            Scanner scanner3 = new Scanner(System.in);
            System.out.println("Introduceti hour rate: ");
            int hourRate = scanner.nextInt();

            Scanner scanner4 = new Scanner(System.in);
            System.out.println("Introduceti capacity: ");
            int capacity = scanner.nextInt();

            Scanner scanner5 = new Scanner(System.in);
            System.out.println("Introduceti free Days: ");
            int freeDays = scanner.nextInt();

            Employee employee = new employee(name,email,hourRate,capacity,freeDays);
            employeeList.add(employee);

        }

        for(Employee em:employeeList){
            System.out.println(em.calculateMonthlyIncome());
        }
 }

}
