public class Cylinder {
    private double height; //圆柱体的高
    private Circle circle; //圆柱体的底面圆

    //创建Circle对象时将半径初始化为r, height代表圆柱高
    public Cylinder(Circle circle, double height) {
        this.circle = circle;
        this.height = height;
    }

    //获取圆柱体的体积
    public double getVolume() {
        return circle.getArea() * height;
    }

    //圆柱体体积输出到屏幕
    public void showVolume() {
        System.out.println("圆柱体的体积为：" + getVolume());
    }
}