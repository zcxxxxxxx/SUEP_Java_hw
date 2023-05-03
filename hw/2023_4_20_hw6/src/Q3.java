interface ShapePara {
    int getArea(); // 获取形状的面积

    int getCircumference(); // 获取形状的周长
}

class Circle implements ShapePara {
    public double radius; // 圆的半径
    private double x; // 圆心的x坐标
    protected double y; // 圆心的y坐标

    // 以半径为参数，圆心在(0,0)的构造函数
    Circle(double radius) {
        this.radius = radius;
        this.x = 0;
        this.y = 0;
    }

    // 获取圆的半径
    double getRadius() {
        return radius;
    }

    // 设置圆心
    void setCenter(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // 设置圆的半径
    void setRadius(double radius) {
        this.radius = radius;
    }

    // 获取圆的面积
    public int getArea() {
        return (int) (Math.PI * radius * radius);
    }

    // 获取圆的周长
    public int getCircumference() {
        return (int) (2 * Math.PI * radius);
    }
}
