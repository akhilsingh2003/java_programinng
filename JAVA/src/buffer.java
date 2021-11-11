public class buffer{

    public static void main(String[] args) {
        StringBuffer br=new StringBuffer();
        System.out.println(br.capacity());
        System.out.println(br.length());
        System.out.println("");
        br.append("Hello");
        System.out.println(br.capacity());
        System.out.println(br.length());
        System.out.println("");
        br.append(" Akhil");
        System.out.println(br.capacity());
        System.out.println(br.length());
        System.out.println("");
        br.append(" Singh");
        System.out.println(br.capacity()); //(oldcapacity*2)+2
        System.out.println(br.length());
        System.out.println("");
        br.append(". How are you?");
        System.out.println(br.capacity());
        System.out.println(br.length());
        System.out.println("");
        br.append(" Hi");
        System.out.println(br.capacity()); //(oldcapacity*2)+2
        System.out.println(br.length());
    }
}