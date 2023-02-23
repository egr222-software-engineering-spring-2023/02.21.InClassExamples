public class Secretary extends Employee {
    public Secretary() {
        super(0);
    }

    public String takeDictation(String text) {
        return "Taking dication of " + text;
    }
}