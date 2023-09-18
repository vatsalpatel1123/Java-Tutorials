class overrideA{
   void A(){
       System.out.println("Mathod of A");
    }
}

class overrideB extends overrideA{

    void A(){
        System.out.println("Mathod of B using Overriding");
    }
    void B(){
        System.out.println("Mathod of B");
    }
}

public class MethodOverRiding {
    public static void main(String[] args) {

        overrideB ob = new overrideB();
        ob.A();
        ob.B();
    }
}
