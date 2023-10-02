package employeework;

public abstract class Person {
    private String personName;

    public Person() {
    }
    public String getPersonName() {
        return personName;
    }
    public Person(String personName) {
        this.personName = personName;
    }

//    public String getPersonName(Employee employee) {
//        return personName;
//    }
//
//    public void setPersonName(String personName) {
//        this.personName = personName;
//    }

    public void calculatePay(){}


}
