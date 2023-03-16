import java.util.List;
import java.util.ArrayList;

public class App {
    public static void q1(){
        int a = 100, x, y;
        x = ++a;
        y = a--;
        System.out.printf("%d, %d, %d", x, y, a);
    }

    public static void q2(){
        int x = 0;
        // x = 5.0 / 2; //error
        float y =12.5F;
        // y = 5.0 / 2; //error
    }

    public static void q3(){
        byte x = 32;
        char c = 'a';
        int n = c - x;
        // c = c - x; //error
    }
    
    public static void q4(){
        int x = 1, y = 2;
        System.out.println(12 + 56 > 34);//A
        // System.out.println(12 + 56 || 34);//B error
        // System.out.println(x + y = 12);//C error
        // System.out.println((12 + 56 > 34) = 13);//D error
    }

    public static boolean q5(){
        return false;
    }

    public static int hw1(int x){
        if(x < 0)
            return -1 + 2 * x;
        else if (x == 0)
            return -1;
        else
            return -1 + 3 * x;
    }

    public static int hw2_1(){
        int i = 1;
        List<Integer> numbers = new ArrayList<>();
        while(true){
            if(i == 1000){
                break;
            }
            if(i % 3 == 0 && i % 7 == 0){
                numbers.add(i);
            }
            i = i + 1;
        }
        Integer sum = numbers.stream().reduce(0, Integer::sum);
        return sum;
    }

    public static int hw2_2(){
        int i = 1, sum = 0;
        
        while(true){
            if(i == 1000){
                break;
            }
            if(i % 3 == 0 && i % 7 == 0){
                sum = sum + i;
            }
            i = i + 1;
        }
        return sum;
    }


    public static long hw2_3(){
        long sum = 0;
        long eight = 8;
        for(int i = 0;i < 10;i++){
            sum = sum + eight;
            eight = eight * 10 + 8;
        }
        return sum;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(hw1(1)); 
        System.out.println(hw1(0)); 
        System.out.println(hw1(-1)); 
        System.out.println(hw2_1());
        System.out.println(hw2_2());
        System.out.println(hw2_3());
    }
}
