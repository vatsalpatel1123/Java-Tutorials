import java.util.Scanner;

public class HandleSpecificExceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number one");
        int num1 = sc.nextInt();

        System.out.println("Enter the number two");
        int num2 = sc.nextInt();
        try{
            System.out.println("The value of num1/num2 is: " + num1/num2);
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException occured!");
            System.out.println(e);
        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("ArrayIndexOutOfBoundsException occured!");
//            System.out.println(e);
//        }
        catch (Exception e){
            System.out.println("Some other exception occured!");
            System.out.println(e);
        }
    }
}
