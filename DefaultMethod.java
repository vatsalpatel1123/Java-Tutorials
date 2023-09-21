interface Animal1{
    // Default method
    default void say(){
        System.out.println("Hello, this is default method");
    }
    void bark();
}
public class DefaultMethod implements Animal1{

    @Override
    public void bark() {
        System.out.println("Dog barks!");
    }
    public static void main(String[] args) {
        DefaultMethod obj1 = new DefaultMethod();
        obj1.bark();
        obj1.say();

    }


}