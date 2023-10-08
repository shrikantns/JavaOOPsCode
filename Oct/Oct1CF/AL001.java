package Oct.Oct1CF;
import java.util.*;
@SuppressWarnings("ALL")
public class AL001 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        list1.add("Shrikant");
        list1.add("Sureshrao");
        list1.add("Nandanwar");
        list1.add("Shardul");
        list1.add("Shrikant");
        list1.add("Nandanwar");
        System.out.println(list1);
        System.out.println(list1.indexOf("Sureshrao"));
        System.out.println(list1.size());
        System.out.println(list1.remove("Shrikant"));
        Collections.sort(list1);
        System.out.println(list1);
        System.out.println(list1.remove("Nandanwar"));
        System.out.println(list1);
    }

}

