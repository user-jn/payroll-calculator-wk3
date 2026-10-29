
public class Employee {

    // Create employee attributes
    private int employeeID;
    private String name;
    private double hoursWorked;
    private double payRate;

    // Constructor takes inputs and adds them to employee blueprint
    public Employee(int employeeID, String name, double hoursWorked, double payRate) {
        this.employeeID = employeeID;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    // Get employee ID
    public int getEmployeeID() {
        return employeeID;
    }

    // Get employee name
    public String getName() {
        return name;
    }

    // Set employee name
    public void setName(String name) {
        this.name = name;
    }

    // Get hours worked
    public double getHoursWorked() {
        return hoursWorked;
    }

    // Set hours worked
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    // Get pay rate
    public double getPayRate() {
        return payRate;
    }

    // Set pay rate
    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    // Calculate gross pay
    public double getGrossPay() {
        double grossPay = hoursWorked * payRate;
        return grossPay;
    }
}
