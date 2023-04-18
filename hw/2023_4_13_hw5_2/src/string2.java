import java.util.Scanner;

public class string2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入第一个字符串：");
        String s1 = scanner.nextLine();

        System.out.println("请输入第二个字符串：");
        String s2 = scanner.nextLine();

        System.out.println("请输入第三个字符串：");
        String s3 = scanner.nextLine();
        String result;
        if (s1.length() >= s2.length() && s1.length() >= s3.length()) {
            if (s2.length() >= s3.length()) {
                result = s1 + s2 + s3;
            } else {
                result = s1 + s3 + s2;
            }
        } else if (s2.length() >= s1.length() && s2.length() >= s3.length()) {
            if (s1.length() >= s3.length()) {
                result = s2 + s1 + s3;
            } else {
                result = s2 + s3 + s1;
            }
        } else {
            if (s1.length() >= s2.length()) {
                result = s3 + s1 + s2;
            } else {
                result = s3 + s2 + s1;
            }
        }
        System.out.println(result);
        // scanner.close();
    }
}

