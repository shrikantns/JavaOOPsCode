package Oct.MapC;

import java.util.HashMap;

public class MA005 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"Mango");
        map.put(2,"Apple");
        map.put(3,"Banana");
        map.put(1,"Grapes");
        System.out.println(map);
        map.remove(1);
        System.out.println(map);
        map.remove(103);
        map.putIfAbsent(103,"Gr");
        System.out.println(map);
    }
}
