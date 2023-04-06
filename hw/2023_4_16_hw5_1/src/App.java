import java.util.Scanner;
public class App {
    public static void main(String[] args){
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("请输入一个整数：");
        // int num1 = scanner.nextInt();
        // System.out.print("请输入另一个整数：");
        // int num2 = scanner.nextInt();
        // GCD q1 = new GCD(num1, num2);
        // System.out.println(num1 + "与" + num2 + "的GCD为" + q1.how_much());
        // scanner.close();


        People q2 = new People();
        q2.setAge(10);
        q2.setEducationBackground("none");
        q2.setGender("plane");
        q2.setHomeAddress("hell");
        q2.setName("xsm");
        System.out.println(q2.getAge() + q2.getEducationBackground() + q2.getGender() + q2.getHomeAddress() + q2.getName());
    }
}
