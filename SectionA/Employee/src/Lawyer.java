public class Lawyer extends Employee {
    public Lawyer(int years) { super(years); }

    @Override
    public int getSalary() {
        return super.getSalary() + 5000 * getYears();
    }

    @Override
    public int getVacationDays() {
        return 15 + getYears() * 2;
    }

    @Override
    public String getVacationForm() {
        return "pink";
    }

    public String sue() {
        return "I'll see you in court!";
    }
}