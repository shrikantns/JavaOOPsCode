package Oct.Queue001;

import java.util.PriorityQueue;

public class Queue002 {
    public static void main(String[] args) {
        ATBStudent1 s1 = new ATBStudent1(1, "Pramond", "ATB");
        ATBStudent1 s2 = new ATBStudent1(2, "Dutta", "ATB");
        PriorityQueue<ATBStudent1> priorityQueue = new PriorityQueue<ATBStudent1>();
        priorityQueue.add(s2);
        priorityQueue.add(s1);
        System.out.println(priorityQueue);
    }
    static class ATBStudent1 implements Comparable<ATBStudent1>{
        private Integer id;
        private String sname;
        private String cname;

        public ATBStudent1(Integer id, String sname, String cname) {
            this.id = id;
            this.sname = sname;
            this.cname = cname;
        }
        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getSname() {
            return sname;
        }

        public void setSname(String sname) {
            this.sname = sname;
        }

        public String getCname() {
            return cname;
        }

        public void setCname(String cname) {
            this.cname = cname;
        }

        @Override
        public String toString() {
            return "ATBStudent1{" +
                    "id=" + id +
                    ", sname='" + sname + '\'' +
                    ", cname='" + cname + '\'' +
                    '}';
        }
        public int compareTo(ATBStudent1 o){
            return Integer.compare(this.id,o.id);
        }
    }

}
