package employeework;

public class SalariedEmployees extends Employee implements Ipayable{
    private int salary;

    public SalariedEmployees(String personName, HireDate hireDate, int salary) {
        super(personName, hireDate);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Name: " + getPersonName() + "\nType of employee: SalariedEmployee"
                  + "\nHireDate: " + getHireDate();
    }
//        return "SalariedEmployees{" +
//                "salary=" + salary +
//                ", hireDate=" + getHireDate() +
//                ", personName='" + getPersonName() + '\'' +
//                '}';
//    }
}
