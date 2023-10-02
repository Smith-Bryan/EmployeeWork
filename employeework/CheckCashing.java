package employeework;

public class CheckCashing {
    public static void main(String[] args) {

        HireDate hireDate = new HireDate("01","04","2001");
        HireDate hiredate1 = new HireDate("11","01","2021");

        Entrepreneur entrepreneur = new Entrepreneur("Maxine",5.5,2000.00);

        SalariedEmployees salariedEmployee = new SalariedEmployees("Elvin",hireDate,4500);

        SalariedEmployees salariedEmployee1 = new SalariedEmployees("Morgan",hireDate,4200);

        HourlyEmployee hourlyEmployee = new HourlyEmployee("Nicole",hiredate1,16.50,40.0);

        HourlyEmployee hourlyEmployee1 = new HourlyEmployee("Tayvon",hiredate1,16.50,24.0);

        Person[] people = {entrepreneur, hourlyEmployee, salariedEmployee1};
        Employee[] employees = {hourlyEmployee,hourlyEmployee1,salariedEmployee,salariedEmployee1};

        HumanResources.issueBadge(employees);


//        System.out.println(entrepreneur);
//        System.out.println("===========================");
//
//
//        System.out.println(salariedEmployee);
//        System.out.println("===========================");
//
//
//        System.out.println(hourlyEmployee);
    }
}
