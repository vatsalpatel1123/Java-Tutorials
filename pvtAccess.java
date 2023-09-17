class employee{
    private int id;
    private String name;

//    public int id;
//    public String name;


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
public class pvtAccess {

    public static void main(String[] args) {

        employee vatsal = new employee();
       vatsal.setId(16);
       vatsal.setName("Vatsal Patel");

        System.out.println(vatsal.getId());
        System.out.println(vatsal.getName());

    }
}
