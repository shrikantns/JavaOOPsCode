package Oct.Oct1CF;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"rawtypes", "unchecked"})
public class AL002 {
    public static void main(String[] args) {
        //ArrayList a = new ArrayList();//Son
        //List l = new ArrayList();//Father
        //Collection c = new ArrayList();//GF
        //c.add("Pramod");
        //System.out.println(c);
        List L = new ArrayList();
        L.add("Pramod");
        L.add(123);
        L.add("Shrikant");
        L.add(456);
        System.out.println(L);
        System.out.println(L.size());
        System.out.println(L.indexOf(123));
        L.remove(1);
        System.out.println(L);
        L.add(3,"Nandanwar");
        System.out.println(L);
        System.out.println("..............");
    }
}
