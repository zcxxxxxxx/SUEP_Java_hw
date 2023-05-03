import java.util.Scanner;
// import java.util.InputMismatchException;

public class Q2 {
    public static void q2() {
        Scanner scanner = new Scanner(System.in);
        try {
            int num = scanner.nextInt();
            if (num > 1000) {
                throw new Exception("录入整数过大，请重新输入一个整数");
            } else if (num < 0) {
                throw new Exception("录入整数过小，请重新输入一个整数");
            }    
        } catch (Exception e) {
            System.out.println(e.getMessage());
            scanner.close();
        }
        scanner.close();
    }
}