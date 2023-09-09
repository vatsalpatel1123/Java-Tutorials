public class encrypt_decrypt_nomral {
    public static void main(String[] args){
        char grade = 'B';
        System.out.printf("Original Grade : %c\n",grade);
        grade = (char)(grade+8);
        System.out.println("Encrypt");
        System.out.println(grade);

        grade = (char)(grade-8);
        System.out.println("Decrypt");
        System.out.println(grade);
    }
}
