import java.util.Scanner;
import java.util.Random;

public class StonePaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();

        int countuser = 0,countcom = 0,noresult=0;
        System.out.print("Enter Number of Attempts : ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {

            System.out.println("\nChooes one of the Following");
            System.out.println("1. Stone");
            System.out.println("2. Paper");
            System.out.println("3. Scissor");
            int user = sc.nextInt();
            int computer = rn.nextInt(1, 4);

            String stone = "Stone";
            String paper = "Paper";
            String scissors = "Scissors";


            if (user == 1 && computer == 1 || user == 2 && computer == 2 || user == 3 && computer == 3) {
                System.out.println("No Result! Try Again");
                noresult++;
            }
            if (user == 1 && computer == 2) {
                System.out.printf("User : %s And Computer : %s\n", stone, paper);
                System.out.println("Ohh! Computer Win!");
                countcom++;
            }
            if (user == 1 && computer == 3) {
                System.out.printf("User : %s And Computer : %s\n", stone, scissors);
                System.out.println("Congratulations You Win!");
                countuser++;
            }
            if (user == 2 && computer == 1) {
                System.out.printf("User : %s And Computer : %s\n", paper, stone);
                System.out.println("Congratulations You Win!");
                countuser++;
            }
            if (user == 2 && computer == 3) {
                System.out.printf("User : %s And Computer : %s\n", paper, scissors);
                System.out.println("Ohh! Computer Win!");
                countcom++;
            }
            if (user == 3 && computer == 1) {
                System.out.printf("User : %s And Computer : %s\n", scissors, stone);
                System.out.println("Ohh! Computer Win!");
                countcom++;
            }
            if (user == 3 && computer == 2) {
                System.out.printf("User : %s And Computer : %s\n", scissors, paper);
                System.out.println("Congratulations You Win!");
                countuser++;
            }

        }
        System.out.println("Score Board");
        System.out.printf("User : %d\n",countuser);
        System.out.printf("Computer : %d\n",countcom);
        System.out.printf("Tie : %d\n",noresult);

        if(countuser>countcom){
            System.out.println("\nCongratulations User Win!");
        }
        else if(countuser<countcom){
            System.out.println("\nOhh! Computer Win!");
        }
    }
}
