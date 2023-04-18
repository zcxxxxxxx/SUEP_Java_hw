public class Circle {
    private double Radius; //存放圆的半径

    //将半径设为0
    public Circle() {
        Radius = 0;
    }

    //创建Circle对象时将半径初始化为r
    public Circle(double r) {
        Radius = r;
    }

    //获取圆的面积
    public double getArea() {
        return Math.PI * Radius * Radius;
    }

    //获取圆的周长
    public double getPerimeter() {
        return 2 * Math.PI * Radius;
    }

    //将圆的半径、周长、面积输出到屏幕
    public void show() {
        System.out.println("圆的半径为：" + Radius);
        System.out.println("圆的周长为：" + getPerimeter());
        System.out.println("圆的面积为：" + getArea());
    }
}


