package general;
import java.util.Scanner;

public class Codeclause_task {

    public static void main(String []args){
        System.out.println("Welcome in  java calculator program ");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number : ");

        int num1=sc.nextInt();
        System.out.println("Enter the second number : ");
        int num2=sc.nextInt();
        System.out.println("Enter the symbol of the operation which you want to perform : ");
        char op=sc.next().charAt(0);
        double res=0;

        switch(op){
            case '+' :{
                res=num1+num2;
                break;

            }
            case '-' :{
                res=num1-num2;
                break;

            }
            case '*' :{
                res=num1*num2;
                break;

            }
            case '/' :{
                if(num2==0){
                    System.out.println("divide by zero error , provide the correct input ");
                    
                    System.exit(0);
                }
                res=(double)num1/num2;
                break;

            }
            default:{
                System.out.println("Invalid input ");
                break;
            }
        }
        System.out.println("The result is : "+res);
    }
    
}
