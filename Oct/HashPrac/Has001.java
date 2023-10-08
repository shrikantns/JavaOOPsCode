package Oct.HashPrac;

import java.util.Enumeration;
import java.util.Hashtable;

public class Has001 {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht1 = new Hashtable<>();
        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3, "three");
        Enumeration<Integer> e = ht1.keys();
        while (e.hasMoreElements()) {
            int key = e.nextElement();
            System.out.println("Rank : " + key
                    + "\t\t Name : "
                    + ht1.get(key));
        }

    }

}

