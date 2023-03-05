import java.util.*;

public class hw2_1{
    public static void qujian(){
        System.out.println("byte range:" + Byte.MIN_VALUE + "to" + Byte.MAX_VALUE);
        System.out.println("short range:" + Short.MIN_VALUE + "to" + Short.MAX_VALUE);
        System.out.println("int range:" + Integer.MIN_VALUE + "to" + Integer.MAX_VALUE);
        System.out.println("long range:" + Long.MIN_VALUE + "to" + Long.MAX_VALUE);
        System.out.println("float range:" + Float.MIN_VALUE + "to" + Float.MAX_VALUE);
        System.out.println("double range:" + Double.MIN_VALUE + "to" + Double.MAX_VALUE);
    }
    public static void time(){
        Scanner sc = new Scanner(System.in);
		System.out.println("first int number");
		int a = sc.nextInt();
        System.out.println("second int number");
		int b = sc.nextInt();
        System.out.printf("%d + %d = %d",a,b,a * b);
		sc.close();
    }
    public static void main (String args[ ]){
        qujian();
    }
}
