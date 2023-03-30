public class App {
    public static void main(String[] args){
        flower q1 = new flower();
        q1.calcuate();

        prime q2 = new prime(10);
        q2.is_prime();

        year q3 = new year(2023);
        q3.is_Leap_Year();
    }
}
