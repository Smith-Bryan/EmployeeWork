package employeework;

public class HourlyEmployee extends Employee implements Ipayable{
    private double hourlyRate;
    private double hoursWorked;

    public HourlyEmployee(String personName, HireDate hireDate, double hourlyRate, double hoursWorked) {
        super(personName, hireDate);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString() {
        return "Name: " + getPersonName() + "\nType of employee: HourlyEmployee"
                + "\nHireDate: " + getHireDate();
    }
}
