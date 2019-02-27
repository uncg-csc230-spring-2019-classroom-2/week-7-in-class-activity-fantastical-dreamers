import java.util.Scanner;

public class ComplexNumbers{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();
        
        System.out.print("Enter the third number: ");
        double num3 = input.nextDouble();
        
        System.out.print("Enter the fourth number: ");
        double num4 = input.nextDouble();
        
        double sum1 = Add(num1, num3);
        double sum2 = Add(num2, num4);
}
    
    public static double Add(double num1, double num2){
        double sum1 = 0;
        double sum2 = 0;
        
        sum1 = num1 + num3;
        sum2 = num2 + num4;
        
    }
}