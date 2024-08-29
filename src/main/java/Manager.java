public class Manager extends Employee{
    private double bonus;

    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, int age, String department, double salary, double bonus) {
        super(name, age, department, salary);
        this.bonus = bonus;
    }
    public double calculateTotalSalary(){
        return this.getSalary() + bonus;
    }

    @Override
    public void displayEmployeeInfo() {
        super.displayEmployeeInfo();
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + calculateTotalSalary());
    }

}
