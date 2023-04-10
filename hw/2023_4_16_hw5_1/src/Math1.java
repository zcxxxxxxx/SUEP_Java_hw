public class Math1 {
    public static double plus(double num1, double num2) {
        return num1 + num2;
    }

    public static double sub(double num1, double num2) {
        return num1 - num2;
    }

    public static double mul(double num1, double num2) {
        return num1 * num2;
    }

    public static double div(double num1, double num2) {
        return num1 / num2;
    }

    public static double opp_num(double num1) {
        return -num1;
    }

    public static double reciprocal(double num1) {
        return 1 / num1;
    }

    public static double abs(double num1) {
        return Math.abs(-num1);
    }

    public static double max(double num1, double num2) {
        if(num1 >= num2)
            return num1;
        else
            return num2;
    }

    public static double min(double num1, double num2) {
        if(num1 <= num2)
            return num1;
        else
            return num2;
    }

    public static double floor(double num1) {
        return Math.floor(num1);
    }

    public static double sqrt(double num1) {
        return Math.sqrt(num1);
    }

    public static double pow(double a, int b) {
        return Math.pow(a, b);
    }
}