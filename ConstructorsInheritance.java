class Base{
    Base(){
        System.out.println("Base Class Default");
    }
    Base(int x){
        System.out.println("Base Class with parameter");
    }
}

class Derived extends Base{
    Derived(){
        System.out.println("Derived Class Default");
    }
    Derived(int x, int y){
//        super(x);
        System.out.println("Derived Class with parameter");
    }
}

public class ConstructorsInheritance {
    public static void main(String[] args) {

//        Base b = new Base();
        Derived d = new Derived();
        Derived dd = new Derived(10,20);

    }
}

