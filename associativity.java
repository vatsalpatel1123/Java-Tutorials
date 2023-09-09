public class associativity {
    public static void main(String[] args){

        //In Arithmetic Exception
        //Associativity and Precedence
//        most Precedence
//        / * % ---> left to Right if same precedence
//        + - ---> left to Right if same precedence
//        ++ =  ---> right to left if same precedence

//        ex

        float a = 7/4.0f * 9/2.0f;
        System.out.println(a);


        int i = 10;
        int b = ++i;
        int c = i++;
        System.out.println(b);
        System.out.println(c);
        System.out.printf("Hey! %d",i);



    }
}
