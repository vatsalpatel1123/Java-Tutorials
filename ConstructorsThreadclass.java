class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        int i = 1;
        while(i<5){
            System.out.println("I am a thread");
            i++;
        }
    }
}
public class ConstructorsThreadclass {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("Vatsal");
        MyThr t2 = new MyThr("Rudra");
        t1.start();
        t2.start();
        System.out.println("The id of the thread t is " + t1.getId());
        System.out.println("The name of the thread t is " + t1.getName());
        System.out.println("The id of the thread t is " + t2.getId());
        System.out.println("The name of the thread t is " + t2.getName());

    }
}