package ExcePractice;

public class Ex004 {
    public static void main(String[] args) {
        ProblemF problemF = new ProblemF();
        int a = problemF.show();
        System.out.println(a);
    }
}

class ProblemF {
    int a = 10;

    int show() {

        try {
            a = 10 / a;
            System.out.println("In try->" + a);
        } catch (Exception e) {
            System.out.println("Yes");

            try {
                a = 20 / 0;
                System.out.println("In try->" + a);
            } catch (Exception e1) {
                System.out.println("Yes");
            }
            System.out.println("in Catch ->" + a);
            return a;
        }
        return 0;
    }
}