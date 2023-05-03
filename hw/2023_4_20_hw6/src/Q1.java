import java.util.ArrayList;

interface shape {
    public double get_area();

    public double get_perimeter();
}

class circle implements shape {
    private double r;

    circle(double r) {
        this.r = r;
    }

    public double get_area() {
        return Math.PI * r * r;
    }

    public double get_perimeter() {
        return 2 * Math.PI * r;
    }
}

class rectangle implements shape {
    private double Long, Width;

    rectangle(double Long, double Width) {
        this.Long = Long;
        this.Width = Width;
    }

    public double get_area() {
        return Long * Width;
    }

    public double get_perimeter() {
        return 2 * (Long + Width);
    }
}

class calute_shape {

    public static double get_area(shape s) {
        return s.get_area();
    }

    public static double get_perimeter(shape s) {
        return s.get_perimeter();
    }
}
