package employeework;

public interface Ipayable {
    public static double calculatepay(double hoursWorked, double hourlyRate) {
        return hoursWorked * hourlyRate;
    }
}
