package employeework;

public class HireDate {
    private String month;
    private String day;
    private String year;

    public HireDate(String month, String day, String year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    @Override
    public String toString() {
        return
                 month + '/' +
              day +'/' +  year;
    }
}
