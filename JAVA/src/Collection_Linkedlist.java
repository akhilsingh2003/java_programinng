//LinkedList implements the Collection interface.
//It uses a doubly linked list internally to store the elements. It can store the duplicate elements.
//It maintains the insertion order and is not synchronized.
//In LinkedList, the manipulation is fast because no shifting is required.

import java.util.*;
public class Collection_Linkedlist {
    public static void main(String args[]){
        LinkedList<String> al=new LinkedList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
