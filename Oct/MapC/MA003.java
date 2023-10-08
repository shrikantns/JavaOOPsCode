package Oct.MapC;

import java.util.HashMap;
import java.util.Map;

public class MA003 {
    public static void main(String[] args) {
        Map<Integer,String> studentMap = new HashMap<>();
        studentMap.put(1,"Shrikant");
        studentMap.put(2,"hrikant");
        studentMap.put(3,"rikant");
        studentMap.put(4,"ikant");
        studentMap.put(5,"kant");
        studentMap.put(6,"ant");
        studentMap.put(7,"nt");
        studentMap.put(8,"t");
        System.out.println(studentMap);
        studentMap.put(null ,"Rahul");
        System.out.println(studentMap);
        for(Map.Entry<Integer,String> e : studentMap.entrySet()){
            System.out.println(e.getKey()+ "---> " + e.getValue());
        }
        studentMap.remove(null ,"Rahul");
        System.out.println(studentMap);
        int size = studentMap.size();
        System.out.println(studentMap);
        studentMap.get("Shrikant");
        System.out.println(studentMap);
    }
}
