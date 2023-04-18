public class Test {
    public static void Visitor_Test() {
        Visitor Test_Class1 = new Visitor(71, 2);
        Visitor Test_Class2 = new Visitor(8, 2);
        Visitor Test_Class3 = new Visitor(70, 1.1);
        Visitor Test_Class4 = new Visitor(38, 2);

        System.out.println("71岁,2米高的票价为" + Test_Class1.getTicketPrice());
        System.out.println("8岁,2米高的票价为" + Test_Class2.getTicketPrice());
        System.out.println("70岁,1.1米高的票价为" + Test_Class3.getTicketPrice());
        System.out.println("38岁,2米高的票价为" + Test_Class4.getTicketPrice());
    }

    public static void Circle_test() {
        Circle Test_Circle1 = new Circle();
        Circle Test_Circle2 = new Circle(5);

        Test_Circle1.show();
        Test_Circle2.show();
    }

    public static void Cylinder_test() {
        Circle circle = new Circle(5);
        Cylinder Test_Cylinder = new Cylinder(circle, 10);
        System.out.println("r = 5, h = 10 的体积为");
        Test_Cylinder.showVolume();
    }

    public static void string1_test() {
        string1.main(null);
    }

    public static void string2_test() {
        string2.main(null);
    }

    public static void Rectangle_test() {
        Rectangle rectangle_test1 = new Rectangle(1, 1, 3, 3);
        Rectangle rectangle_test2 = new Rectangle(2, 2, 1, 2);
        rectangle_test1.printPerimeterAndArea();
        rectangle_test2.printPerimeterAndArea();

        System.out.println(Position.getPosition(rectangle_test1, rectangle_test2));
    }

    public static void main(String[] args) {
        Visitor_Test();
        System.out.println();

        Circle_test();
        System.out.println();

        Cylinder_test();
        System.out.println();

        string1_test();
        System.out.println();

        string2_test();
        System.out.println();

        Rectangle_test();

    }

}