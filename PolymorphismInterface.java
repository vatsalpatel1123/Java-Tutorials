
 abstract class bank{
     abstract float RateOfInt();
}

class SBI extends bank{
    float RateOfInt(){
        return 7.3f;
    }
}

class ICICI extends bank{
    float RateOfInt(){
        return 8.4f;
    }
}

public class PolymorphismInterface {

    public static void main(String[] args) {

        bank s = new SBI();
        bank i = new ICICI();

        System.out.println(s.RateOfInt());
        System.out.println(i.RateOfInt());

    }
}


