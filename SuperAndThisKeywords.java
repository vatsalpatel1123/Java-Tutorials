class Base1{

    int a;
    Base1(){
        this.a = 10;
        System.out.println(a);
    }
    Base1(int x){
        System.out.println("Base Class with parameter : "+x);
    }
}

class Derived1 extends Base1{
    int b;
    Derived1(){
        this.b = 20;
//        b = 20;  Not Valid
        System.out.println(b);
    }
    Derived1(int x){
        super(x);
        System.out.println("Derived Class with parameter : "+x);
    }
}



public class SuperAndThisKeywords {
    public static void main(String[] args) {

//        Base1 b = new Base1();
        Derived1 d = new Derived1(10);
    }
}
