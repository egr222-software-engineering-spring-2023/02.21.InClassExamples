public class LegalSecretary extends Secretary {
    public void fileLegalBriefs() {
        System.out.println("I could file all day!");
    }

    @Override
    public int getSalary() {
        return super.getSalary() + 5000;
    }
}