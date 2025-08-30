import java.util.Scanner;
class Program1
{
    public static void main(String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        String op = 
        (num%2==0)?    //operand 1
        (num+" is EVEN."): //operand 2
        (num+" is ODD."); // operand 3

        System.out.println(op);
        
        }
}