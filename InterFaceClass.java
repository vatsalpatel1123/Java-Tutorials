interface Bicycle{
    int a = 16;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface HornBicycle{
    int x = 25;
    void blowHornK3g();
    void blowHornmhn();
}

class AvonCycle implements Bicycle, HornBicycle{
    //public int x = 5;
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying Brake");
    }
    public void speedUp(int increment){
        System.out.println("Applying SpeedUP");
    }
    public void blowHornK3g(){
        System.out.println("Kabhi khushi kabhi gum pee pee pee pee");
    }
    public void blowHornmhn(){
        System.out.println("Main hoon naa po po po po");
    }
}
public class InterFaceClass {
    public static void main(String[] args) {
        AvonCycle cyc = new AvonCycle();
        cyc.applyBrake(1);
        // You can create properties in Interfaces
        System.out.println(cyc.a);
        System.out.println(cyc.x);

        // You cannot modify the properties in Interfaces as they are final
        // cyc.a = 454;
        //System.out.println(cyc.a);

        cyc.blowHornK3g();
        cyc.blowHornmhn();
    }
}
