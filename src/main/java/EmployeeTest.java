public class EmployeeTest {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Ria", 20, "Development", 100000);
        Manager man1 = new Manager("Alien",25,"Finance", 90000, 5000);
        System.out.println("----Before Salary raise-----");
        emp1.displayEmployeeInfo();
        System.out.println();
        man1.displayEmployeeInfo();

        System.out.println();
        emp1.raiseSalary(10);
        System.out.println();
        man1.raiseSalary(10);
        System.out.println();

        System.out.println("----After Salary raise-----");
        emp1.displayEmployeeInfo();
        System.out.println();
        man1.displayEmployeeInfo();
    }
}
