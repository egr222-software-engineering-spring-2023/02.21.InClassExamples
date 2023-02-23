public class Main {

    public static void main(String[] args) {
        Employee e = new Employee(6);
        Secretary s = new Secretary();
        Lawyer l = new Lawyer(8);
        Marketer m = new Marketer(4);
        LegalSecretary ls = new LegalSecretary();

        printInfo(e);
        printInfo(s);
        printInfo(l);
        printInfo(m);

        System.out.println("Employee salary: " + e.getSalary());
        System.out.println("Secretary salary: " + s.getSalary());
        System.out.println("Lawyer salary: " + l.getSalary());
        System.out.println("Marketer salary: " + m.getSalary());
        System.out.println("Legal Secretary salary: " + ls.getSalary());

        System.out.println();

        System.out.println("Employee vacation form: " + e.getVacationForm());
        System.out.println("Secretary vacation form: " + s.getVacationForm());
        System.out.println("Lawyer vacation form: " + l.getVacationForm());
        System.out.println("Marketer vacation form: " + m.getVacationForm());
        System.out.println("Legal Secretary vacation form: " + ls.getVacationForm());

        System.out.println();

        System.out.println("Employee vacation days: " + e.getVacationDays());
        System.out.println("Secretary vacation days: " + s.getVacationDays());
        System.out.println("Lawyer vacation days: " + l.getVacationDays());
        System.out.println("Marketer vacation days: " + m.getVacationDays());
        System.out.println("Legal Secretary vacation days: " + ls.getVacationDays());

        System.out.println();

        s.takeDictation("Meeting notes");
        l.sue();
        System.out.println(m.advertise());
        ls.fileLegalBriefs();
    }

    public static void printInfo(Employee e) {
        System.out.println("Employee vacation days: " + e.getVacationDays());
        System.out.println("Employee annual salary: " + e.getSalary());
        System.out.println("Employee vacation form: " + e.getVacationForm());
    }
}