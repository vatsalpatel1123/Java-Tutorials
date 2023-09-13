public class SumFirstNaturalNumbers {

    static int sumRec(int n) {
            // Base condition
            if (n == 1) {
                return 1;
            }
            return n + sumRec(n - 1);
        }



        public static void main(String[] args) {


             int c = sumRec(5);
             System.out.println(c);


        }
    }

