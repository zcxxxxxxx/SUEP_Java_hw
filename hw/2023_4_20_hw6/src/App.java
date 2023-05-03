public class App {
    public static void main(String[] args) {
        /* Q1 */
        circle c1 = new circle(10);
        rectangle r = new rectangle(4, 5);
        System.out.println("半径为10的圆的面积为" + calute_shape.get_area(c1));
        System.out.println("半径为10的圆的周长为" + calute_shape.get_perimeter(c1));
        System.out.println("长为4,宽为5的矩形面积为" + calute_shape.get_area(r));
        System.out.println("长为4,宽为5的矩形周长为" + calute_shape.get_area(r));

        /* Q2 */
        fish[] Fish = new fish[3];
        tiger[] Tiger = new tiger[4];
        SouthEastTiger[] Stiger = new SouthEastTiger[5];
        for (int i = 0; i < 3; i++) {
            Fish[i] = new fish();
            System.out.println("第" + (i + 1) + "个fish有" + Fish[i].getLegs() + "条腿");
        }
        System.out.println("总共" + fish.getCount() + "个gish");

        for (int i = 0; i < 4; i++) {
            Tiger[i] = new tiger();
            System.out.println("第" + (i + 1) + "个tiger有" + Tiger[i].getLegs() + "条腿");
        }
        System.out.println("总共" + tiger.getCount() + "个tiger");

        for (int i = 0; i < 5; i++) {
            Stiger[i] = new SouthEastTiger();
            System.out.println("第" + (i + 1) + "个SouthEastTiger有" + Stiger[i].getLegs() + "条腿");
        }
        System.out.println("总共" + SouthEastTiger.getCount() + "个SouthEastTiger");
        System.out.println("总共" + tiger.getCount() + "个tiger");

        /* Q3 */
        Circle c = new Circle(5);
        System.out.println("半径: " + c.getRadius());
        System.out.println("面积: " + c.getArea());
        System.out.println("周长: " + c.getCircumference());
        c.setCenter(3, 4);
        c.setRadius(7);
        System.out.println("半径: " + c.getRadius());
        System.out.println("面积: " + c.getArea());
        System.out.println("周长: " + c.getCircumference());


    }
}