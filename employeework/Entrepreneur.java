package employeework;

public class Entrepreneur extends Person implements Ipayable{

    private double revenue;
    private double expenses;

    public Entrepreneur(String personName, double revenue, double expenses) {
        super(personName);
        this.getRevenue();
        this.getExpenses();
    }


    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public double getExpenses() {
        return expenses;
    }

    public void setExpenses(double expenses) {
        this.expenses = expenses;
    }

    @Override
    public String toString() {
        return "Name: " + getPersonName() + "\nEntrepreneur" + "\nRevenue: " + getRevenue() + "\nExpenses " + getExpenses();

//                "Entrepreneur{" +
//                "revenue=" + revenue +
//                ", expenses=" + expenses +
//                ", personName='" + getPersonName() + '\'' +
//                '}';
    }
}
