public class Marketer extends Employee {
    public Marketer(int years) { super(years); }

    public String advertise() {
        return "Get them now while they last!";
    }

    @Override
    public int getSalary() {
        return super.getSalary() + 10000;
    }
}