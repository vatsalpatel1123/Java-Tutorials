import java.util.*;
public class ConstructorsDate extends Thread{
    public static void main(String[] args) {
        Date d= new Date();
        System.out.println("The current date is : " + d);

        Date d1= new Date(1621709639111l);
        System.out.println("The date calculated form miliseconds is : " + d1);

    }
}
