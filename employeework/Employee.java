package employeework;

public abstract class Employee extends Person implements Ipayable{
    private HireDate hireDate;

    public Employee(String personName, HireDate hireDate) {
        super(personName);
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "hireDate=" + hireDate +
                '}';
    }

    public Employee() {
        hireDate = new HireDate("01","22","1942");
    }

    public HireDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(HireDate hireDate) {
        this.hireDate = hireDate;
    }
}
