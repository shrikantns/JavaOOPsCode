package Oct.MapC;

import java.util.*;

public class MA007 {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(7,"Tushar");
        hm.put(8,"Vishal");
        hm.put(4,"Ashish");
        hm.put(60, "Amol0");
        hm.put(6,"Tushar");
        hm.put(12,"Ashu");
        hm.put(5,"Zoya");
        hm.put(78,"Yash");
        hm.put(10,"Praveen");
        hm.put(67,"Boby");
        hm.put(1,"Ritesh");

        for(Map.Entry<Integer, String> e : hm.entrySet()){
            System.out.println(e.getKey()+ "--->" +e.getValue());
        }
        System.out.println("---------------------");

        Set<Map.Entry<Integer, String>> set =hm.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator = set.iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer, String> map = iterator.next();
            System.out.println(map.getKey() + "---->" +map.getValue());
        }
    }

}
