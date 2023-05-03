class Circle {
    private double radius;

    public Circle(double radius) throws Exception {
        if (radius <= 0) {
            throw new Exception("半径不能为0或负数");
        }
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}




