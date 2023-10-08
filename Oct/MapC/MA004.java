package Oct.MapC;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("ALL")
public class MA004 {
    public static void main(String[] args) {
        Map<String, Integer> hm = new HashMap<>();
        hm.put("a", 100);
        hm.put("b", 200);
        hm.put("c", 300);
        hm.put("d", 400);
        System.out.println(hm);
        for (Map.Entry<String, Integer> me : hm.entrySet()) {
            System.out.println(me.getKey() + ":" + me.getValue());
            if (me.getValue() != 100) {
            } else {
                hm.remove(me.getValue());
            }
        }
    }
}

