public class Visitor {
    private int age;
    private double height;

    public Visitor(int age, double height) {
        this.age = age;
        this.height = height;
    }

    public double getTicketPrice() {
        if (age > 70) {
            return 40.0;
        } else if (age < 8 || height < 1.2) {
            return 0.0;
        } else {
            return 80.0;
        }
    }
}