class MymainEmployee
    {
        private int id;
        private String name;
        public MymainEmployee()
        {
            id=20;
            name="Your name here";

        }

        public String getName() { return name;}
        public void setName(String n){this.name=n;}
        public void setId(int i){this.id=1;}
        public int getId() {return id;}
    }
    public class constructor {
    public static void main(String[] args) {

        MymainEmployee ak=new MymainEmployee();
        System.out.println(ak.getId());
        System.out.println(ak.getName());

    }
}
