package ExcePractice;

public class Ex003 {
    public static void main(String[] args) {
        try{
            String S1 = "";
            S1.trim();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("i am done and finally");
        }
    }
}
