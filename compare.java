import java.util.Scanner;

public class compare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to Compare is Grater then 100 or not");
        int input = sc.nextInt();

        if(input<100){
            System.out.printf("%d is less then 100",input);
        }
        else {
            System.out.printf("%d is grater then 100",input);
        }
    }
}
