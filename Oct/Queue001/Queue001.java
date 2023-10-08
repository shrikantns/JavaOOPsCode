package Oct.Queue001;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue001 {
    public static void main(String[] args) {

        Queue<Integer> integerQueue = new PriorityQueue<Integer>();
        //Arranged in order of processing
        Integer a = 132;
        Integer b = 11;
        Integer c = 2;
        integerQueue.add(a);
        integerQueue.add(b);
        integerQueue.add(c);
        System.out.println(integerQueue);
        integerQueue.poll();
        System.out.println(integerQueue);
        System.out.println(integerQueue.peek());
        Iterator<Integer> iterator = integerQueue.iterator();
        while (iterator.hasNext()) System.out.println(iterator.next() + " ");

    }

}
