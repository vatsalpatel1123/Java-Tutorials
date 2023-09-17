class emp{
    private int id;
    private String name;

    public emp(){
        name = "vatsal";
        id = 12;
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

public class ConstructorJava {
    public static void main(String[] args) {

        emp vatsal = new emp();

//        vatsal.setId(18);
//        vatsal.setName("Vatsal Patel");

        System.out.println(vatsal.getId());
        System.out.println(vatsal.getName());

    }
}
