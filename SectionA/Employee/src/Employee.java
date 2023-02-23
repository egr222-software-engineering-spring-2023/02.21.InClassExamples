public class Employee {
    private int years;

//    public Employee() {
//        this(0);
//    }

    public int getYears() {
        return years;
    }

    public Employee(int years) {
        this.years = years;
    }

    public int getHours() {
        return 40;
    }

    public int getSalary() {
        return 55000;
    }

    public int getVacationDays() {
        return 10 + 2 * years;
    }

    public String getVacationForm() {
        return "yellow";
    }
}