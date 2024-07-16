import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int number1, number2, result;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the symbol for the respective operation like '+','-','*','%','/': ");
         char operator = sc.next().charAt(0);
        System.out.println("Please enter the number 1 ");
        number1=sc.nextInt();
        System.out.println("Please enter the number 2 ");
        number2=sc.nextInt();
         switch (operator){
             case '+':
                 int sum= number1+number2;
                 System.out.println("Addition is :"+ sum);
                 break;
             case'-':
                 int diff= number1-number2;
                 System.out.println("Difference is :"+ diff);
                 break;
             case'*':
                 int product=number1*number2;
                 System.out.println("Product is :"+ product );
                 break;
             case'/':
                 int quotient= number1/number2;
                 System.out.println("Quotient is :"+quotient);
                 break;
             case'%':
                 int remainder=number1%number2;
                 System.out.println("remainder is :"+remainder);
                 break;
             default:
                 System.out.println("Invalid symbol");
         }
    }
}