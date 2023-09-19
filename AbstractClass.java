abstract class parent{
    public parent(){
        System.out.println("parent class");
    }
    abstract public void abstract1();
    abstract public void abstract2();

}

class child extends parent{
    child(){
        System.out.println("Child Class");
    }
    public void abstract1(){
        System.out.println("Abstract 1 class in child");
    }

    public void abstract2(){
        System.out.println("Abstract 2 class in child");
    }
}


public class AbstractClass {

    public static void main(String[] args) {

        child c = new child();
        c.abstract1();
        c.abstract2();

    }
}

