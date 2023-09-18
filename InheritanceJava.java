class Animal{
    void eat(){
        System.out.println("eating");
    }
}

class Dog extends Animal{
    void run(){
        System.out.println("runing");
    }
}

class BabyDog extends Dog{
    void sleep(){
        System.out.println("sleeping");
    }
}

public class InheritanceJava {
    public static void main(String[] args) {

        BabyDog bd = new BabyDog();
        bd.sleep();
        bd.run();
        bd.eat();

    }
}
