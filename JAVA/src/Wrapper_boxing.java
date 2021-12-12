public class Wrapper_boxing {
    public static void main(String[] args) {

        // create primitive types
        int a = 5;
        double b = 5.65;

        //converts into wrapper objects
        Integer aObj = Integer.valueOf(a);
        Double bObj = Double.valueOf(b);

        if(aObj instanceof Integer) {
            System.out.println("An object of Integer is created.");
        }

        if(bObj instanceof Double) {
            System.out.println("An object of Double is created.");
        }
        // how JVM converts the primitive into wrapper
//        int a = 5;
//// converts into object
//        Integer aObj = a;
//        System.out.println(aObj);
//
//        double b = 5.6;
//// converts into object
//        Double bObj = b;
//        System.out.println(bObj);
    }
}
