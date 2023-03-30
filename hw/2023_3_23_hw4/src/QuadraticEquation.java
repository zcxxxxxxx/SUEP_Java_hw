import java.util.Scanner;

class QuadraticEquation {
   public void calculate() {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter the values of a, b, and c: ");
      double a = input.nextDouble();
      double b = input.nextDouble();
      double c = input.nextDouble();

      double discriminant = b * b - 4 * a * c;

      if (discriminant > 0) {
         double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
         double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
         System.out.println("The equation has two roots " + root1 + " and " + root2);
      }
      else if (discriminant == 0) {
         double root = -b / (2 * a);
         System.out.println("The equation has one root " + root);
      }
      else {
        double root1 = (-b + Math.sqrt(-discriminant)) / (2 * a);
        double root2 = (-b - Math.sqrt(-discriminant)) / (2 * a);
        System.out.println("The equation has two roots " + root1 + "i" + " and " + root2 + "i");
      }
   }
}
