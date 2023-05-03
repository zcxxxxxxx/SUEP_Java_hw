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

        Employee.showTotalSalary();
        Employee emp1 = new Employee(1, 25, "John");
        Employee emp2 = new Employee(2, 30, "Jane");

        Employee emp3 = new Employee(5000, "A123");
        Employee emp4 = new Employee(6000, "B456");

        Employee.showTotalEmployee(); // 显示员工总数和总工资
        Employee.showTotalSalary(); // 显示员工总数和总工资

        emp3.addSalary(10000); // 增加emp3的工资
        emp4.addSalary(2000); // 增加emp4的工资

        Employee.showTotalSalary(); // 再次显示总工资

        emp3.minusSalary(500); // 减少emp3的工资
        emp4.minusSalary(10000); // 减少emp4的工资

        Employee.showTotalSalary(); // 再次显示总工资

    }
}
