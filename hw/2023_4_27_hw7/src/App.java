public class App {
    public static void main(String[] args) {
        try {
            Circle circle1 = new Circle(2.5);
            System.out.println("圆的面积为：" + circle1.getArea());
            System.out.println("圆的周长为：" + circle1.getPerimeter());

            Circle circle2 = new Circle(-1);
            System.out.println("圆的面积为：" + circle2.getArea());
            System.out.println("圆的周长为：" + circle2.getPerimeter());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Q2 q2 = new Q2();
        q2.q2();
    }
}
