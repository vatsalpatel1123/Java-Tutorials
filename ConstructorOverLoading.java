class empp{
    private int id;
    private String name;

    public empp(int m,String n){
        id = m;
        name = n;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class ConstructorOverLoading {
    public static void main(String[] args) {

        empp vatsal = new empp(10,"Vatsal");

        System.out.println(vatsal.getId());
        System.out.println(vatsal.getName());

    }
}
