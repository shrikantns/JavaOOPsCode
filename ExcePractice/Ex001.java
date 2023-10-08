package ExcePractice;

public class Ex001 {
    public static void main(String[] args) {
        try {
            String ip =args[2];
            int a = Integer.parseInt(args[2]);
            int b = 10/a;
            System.out.println(a);
            System.out.println(b);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
