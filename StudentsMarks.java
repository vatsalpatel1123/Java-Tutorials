import java.util.Scanner;

public class StudentsMarks {

    public static void main(String[] args){
        System.out.println(" - Students Marks Calculation - ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Maths Marks : ");
        float math = sc.nextFloat();
        System.out.print("Enter Science Marks : ");
        float science = sc.nextFloat();
        System.out.print("Enter SS Marks : ");
        float ss = sc.nextFloat();
        System.out.print("Enter Language Marks : ");
        float lang = sc.nextFloat();
        System.out.print("Enter Drawing Marks : ");
        float drawing = sc.nextFloat();

        float total = math+science+ss+lang+drawing;
        float per = (total/500)*100;

        System.out.print(per);
        System.out.println(" %");

    }
}
