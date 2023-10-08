package Oct.Oct1CF;

import java.util.Vector;

public class CF0001 {
    public static void main(String[] args) {
        Vector v;
        v = new Vector();
        v.add(0, "Ram");
        v.add(1,"Rahul");
        v.add(2,"Cho Hin");
        v.add(3,"Shrikant");
        System.out.println(v);
        v.add("New");
        System.out.println(v);
        v.remove(0);
        System.out.println(v);
        v.capacity();
    }
}
