import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arraylist {

    public static void main(String[] args) {
        // write your code here
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(67);
        al.add(52);
        al.add(54);
        ArrayList<Integer> al2=new ArrayList<Integer>();
        al2.addAll(al);
        al2.add(98);
        al2.add(66);
        al.add(23);
        System.out.println(al); //[67, 52, 54, 23]
        System.out.println(al2); //[67, 52, 54, 98, 66]
        System.out.println(al2.retainAll(al)); //true
        System.out.println(al2); //[67, 52, 54]
        al.remove(new Integer(52));
        System.out.println(al); //[67, 54, 23]
        System.out.println(al.size()); //3
        al2.add(21);
        System.out.println(al2.size()); //4
        System.out.println(al); //[67, 54, 23]
        System.out.println(al2);  //[67, 52, 54, 21]
        al.removeAll(al2);
        System.out.println(al); //[23]
        al2.clear();
        System.out.println(al2); //[]
        System.out.println(al.contains(87)); //false
        System.out.println(al.contains((23))); //true
        System.out.println(al.isEmpty()); //false
        System.out.println(al2.isEmpty()); //true
        al.add(0,32);
        System.out.println(al); //[32, 23]
        al.set(0,76);
        System.out.println(al); //[76, 23]
        System.out.println(al.get(1)); //23
        System.out.println(al.indexOf(76)); //0
        System.out.println(al.lastIndexOf(76)); //0
        System.out.println(al.indexOf(87)); //-1
        System.out.println(al.lastIndexOf(99)); //-1
       // System.out.println(al.remove(6));
        System.out.println(al.remove(0)); //76
        System.out.println(al); //23
        al2.add(98);
        al2.add(66);
        al2.add(87);
        al2.add(54);
        System.out.println(al2); //[98, 66, 87, 54]
        al2.add(98);
        al2.add(66);
        al2.add(87);
        al2.add(54);
        System.out.println(al2); //[98, 66, 87, 54]
        List<Integer> al3=new ArrayList<>();
        al3=al2.subList(0,3);
        System.out.println(al3); //[98, 66, 87]
        ArrayList al4=new ArrayList(al3);
        System.out.println(al4); //[98, 66, 87]
        ArrayList al5=new ArrayList(6);
        al5.add(67);
        al5.add("Akhil");
        al5.add("Singh");
        System.out.println(al5); //[67, Akhil, Singh]
        ArrayList al6=new ArrayList();
        al6.add("Test");
        al6.add(98.67);
        System.out.println(al6); //[Test, 98.67]
        Iterator i=al5.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
            /*67
            Akhil
            Singh */
        }

    }
}