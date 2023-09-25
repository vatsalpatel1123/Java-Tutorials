class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }
    public void run(){
        int i = 1;
       while(i<5){
            System.out.println("I am a thread");
            System.out.println("Thank you: " + this.getName());
            i++;
        }

    }
}

public class ThreadPriorities {
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1("Vatsal");
        MyThr1 t2 = new MyThr1("Rudra");
        MyThr1 t3 = new MyThr1("Ayushi (most Important)");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();

    }
}
