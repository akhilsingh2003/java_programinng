class empolyee
{
   // private int id;
   private String name;
   public String getName()
   {
       return name;
   }
   public void  setName(String n)
   {
       this.name=n;
   }
}
public class custom_class {
    public static void main(String[] args) {
        System.out.println("this is our custom class");
        empolyee ak =new empolyee();
//        ak.id=12;
//        ak.name="Akhil";
//        System.out.println(ak.id);
//        System.out.println(ak.name);
          ak.setName("akhil");
        System.out.println(ak.getName());
    }
}
