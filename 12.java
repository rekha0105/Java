import java.util.*;
class num{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            
            System.out.print("Enter the 1st num : ");
            String input1 = sc.nextLine();

            System.out.print("Enter the 2nd num: ");
            String input2 = scanner.nextLine();
            int n1 = Integer.parseInt(input1);
            int n2 = Integer.parseInt(input2);
          int result = n1 / n2;

        
            System.out.println("Result: " + result);

        } catch (NumberFormatException e) {
            System.out.println("not integers.");
        } catch (ArithmeticException e) {
            System.out.println("division not allowed");
        } 
        
    }
}