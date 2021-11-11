public class string{

    public static void main(String[] args) {
        String str="Akhil";
        String str2=new String("Akhil");
        String str3="Akhil";
        System.out.println(str==str2);
        System.out.println(str2==str3);
        System.out.println(str==str3);
        System.out.println("");

        String str4="Hello";
        String str5=new String("Hello").intern();
        System.out.println(str4==str5);

        System.out.println("");

        System.out.println(str.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals(str));

        System.out.println("");

        String str6="hello";
        System.out.println(str4.equals(str6));
        System.out.println(str4.equalsIgnoreCase(str6));

        System.out.println("");

        System.out.println(str6.toLowerCase());
        System.out.println(str6.toUpperCase());

        System.out.println("");

        System.out.println(str6.indexOf('o'));
        System.out.println(str6.indexOf("ll", 0));
        System.out.println(str6.indexOf("e", 2));

        System.out.println("");

        System.out.println(str6.lastIndexOf('o'));
        System.out.println(str6.lastIndexOf("e", 2));

        System.out.println("");

        System.out.println(str.compareTo(str4));

        System.out.println(str6.substring(2));
        System.out.println(str6.substring(2,4));
    }
}
