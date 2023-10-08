package Oct.Oct1CF;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"rawtypes", "unchecked"})
public class AL003 {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        List L = new ArrayList();
        ArrayList C = new ArrayList();
        Collection B = new ArrayList();
        C.add("Tejashree");
        C.add("Haribhau");
        C.add("Kumbhare");
        System.out.println(C);
        Collections.sort(C);
        System.out.println(C);
        System.out.println(L);
        System.out.println(a);
        System.out.println(B);
        B.add("Shrikant");
        B.add("Shrikant");
        B.add("Rahul");
        B.add(3);
        System.out.println(B);
        System.out.println(B.remove("Rahul"));
        System.out.println(B);
    }
}
