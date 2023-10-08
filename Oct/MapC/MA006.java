package Oct.MapC;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MA006 {
    public static void main(String[] args) {
        Map m = new HashMap<>();
        //Map S1 = new TreeMap();
        //Map S2 = new LinkedHashMap();
        m.put("name", "Shrikant");
        m.put(1, "Shrikant");
        m.put("Surname", "Nandanwar");
        m.put(10, 230);
        System.out.println(m);

        Hashtable<Integer, String> ht = new Hashtable<>();
        //Synchronized and Thread Safe
        ht.put(1, "Ram");
        // ht.put(null, "Rahul");
        ht.put(2, "Uuuuu");
    }
}