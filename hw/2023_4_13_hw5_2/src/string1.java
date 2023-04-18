import java.util.Scanner;

public class string1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入字符串");
        String str = scanner.nextLine();
        int upperCount = 0, lowerCount = 0, digitCount = 0, spaceCount = 0, otherCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                upperCount++;
            } else if (Character.isLowerCase(ch)) {
                lowerCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            } else if (Character.isSpaceChar(ch)) {
                spaceCount++;
            } else {
                otherCount++;
            }
        }
        System.out.println("大写字母个数：" + upperCount);
        System.out.println("小写字母个数：" + lowerCount);
        System.out.println("数字个数：" + digitCount);
        System.out.println("空格个数：" + spaceCount);
        System.out.println("其他字符个数：" + otherCount);
        // scanner.close();
    }
}
