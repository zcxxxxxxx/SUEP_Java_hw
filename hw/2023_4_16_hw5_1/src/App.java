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
            System.out.println("age = " + q2.getAge() + " ducationBackground = " + q2.getEducationBackground() + " Gender = " + q2.getGender() + " HomeAddress = " + q2.getHomeAddress() + " Name = " + q2.getName());    

            double num11 = 5;
            double num22 = 10;
            System.out.println(num11 + " + " + num22 + "=" + Math1.plus(num11, num22));
            System.out.println(num11 + " - " + num22 + "=" + Math1.sub(num11, num22));
            System.out.println(num11 + " * " + num22 + "=" + Math1.mul(num11, num22));
            System.out.println(num11 + " / " + num22 + "=" + Math1.div(num11, num22));
            System.out.println(num11 + "的相反数" + "=" + Math1.opp_num(num11));
            System.out.println(num11 + "的倒数" + "=" + Math1.reciprocal(num11));
            System.out.println(num11 + "的绝对值" + "=" + Math1.abs(num11));
            System.out.println(num11 + " 和 " + num22 + "最大的一个" + "=" + Math1.max(num11, num22));
            System.out.println(num11 + " 和 " + num22 + "最小的一个" + "=" + Math1.min(num11, num22));
            System.out.println(num11 + "的近似值" + "=" + Math1.floor(3.14));
            System.out.println(num11 + "的平方根" + "=" + Math1.sqrt(num11));
            System.out.println(num11 + " 的 " + num22 + "次方" + "=" + Math1.sub(num11, num22));

            Cat cat = new Cat();
            Dog dog = new Dog();
            cat.CanCry();
            dog.CanCry();
    }
}
