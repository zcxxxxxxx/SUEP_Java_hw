class Employee {
    private int id;
    private String name;
    private int age;
    private double salary;
    private String idNumber;
    private static int totalEmployee = 0;
    private static double totalSalary = 0;
    private static double MinSalary = 1000;

    public Employee(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
        totalEmployee++;
    }

    public Employee(double salary, String idNumber) {
        this.salary = salary;
        this.idNumber = idNumber;
        totalEmployee++;
        totalSalary += salary;
    }

    public void addSalary(double addSalary) {
        try {
            if (salary + addSalary > totalSalary) {
                throw new Exception("Salary too high");
            }
            salary += addSalary;
            totalSalary += addSalary;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void minusSalary(double minusSalary) {
        try {
            if (salary - minusSalary < MinSalary) {
                throw new Exception("Salary too low");
            }
            salary -= minusSalary;
            totalSalary -= minusSalary;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void showTotalSalary() {
        try {
            if (totalSalary == 0) {
                throw new Exception("Total salary is empty");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Total salary: " + totalSalary);
    }

    public static void showTotalEmployee() {
        try {
            if (totalEmployee == 0) {
                throw new Exception("Total employee is empty");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Total employee: " + totalEmployee);
    }
}
