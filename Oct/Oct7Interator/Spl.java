package Oct.Oct7Interator;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

@SuppressWarnings("ALL")
public class Spl {
    public static void main(String[] args) {
        //ArrayList al = new ArrayList();
        //Set courseSets = new HashSet(); //Dynamic Dispatch
        //Set hs = new HashSet();

        Set lhs = new LinkedHashSet();
        //Doubly -Linkedin List
        lhs.add("pramond");
        lhs.add("dutta");
        lhs.add("lucky");
        lhs.add(null);
        System.out.println(lhs);

        Set treeset = new TreeSet();
        treeset.add("pramod");
        System.out.println(treeset);

    }
}
