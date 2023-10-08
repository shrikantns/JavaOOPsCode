package PracticeCons;

public class ConPractice {
    int x;
    ConPractice(int a) {
       x = a;
    }
    public static void main(String[] args) {
        ConPractice t1 = new ConPractice(62);
        ConPractice t2 = new ConPractice(40);
        System.out.println(t1.x+ "*" +t2.x);

    }
}
