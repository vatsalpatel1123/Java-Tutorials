
    class employees{
//        private int id;
//        private String name;

    public int id;
    public String name;

    public void getDetails(){
            System.out.println("id :"+id);
            System.out.println("name :"+name);

    }

    }
    public class pubAccess {

        public static void main(String[] args) {

            employees vatsal = new employees();
            vatsal.id = 16;
            vatsal.name = "Vatsal";

//            System.out.println(vatsal.id);
//            System.out.println(vatsal.name);

            vatsal.getDetails();

        }
    }

