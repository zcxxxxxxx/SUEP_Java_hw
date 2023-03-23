public class App {
    public static void main(String[] args) throws Exception {
        SUM q1_1 = new SUM(1, 1, 100, 0);
        System.out.println(q1_1.sum()); 
        SUM q1_2 = new SUM(1, 2, 10, 1);
        System.out.println(q1_2.sum()); 
        SUM q1_3 = new SUM(1, 1, 10, 1);
        System.out.println(q1_3.sum()); 

        print_english q2 = new print_english();
        q2.Positive();
        System.out.println();
        q2.reverse();

        System.out.println();
        QuadraticEquation q3 = new QuadraticEquation();
        q3.calculate();

    }
}
