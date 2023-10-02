package employeework;

public class HumanResources {
    /*
    FIRST get employee name
    print the name
     */
    public static void printBadge(Employee employee) {
        String employeeName = employee.getPersonName();
        System.out.println(employeeName);
    }

    public static void issueBadge(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee + " ");
            System.out.println("===================");
        }

    }
}