package Wrapcls21092023;

public class WP003 {
    public static void main(String[] args) {
        //Primitive to string
        int x = 123;
        //String S1= x;
        //String S1 =(String)x;
        String s1 = x + "";
        String s2 = String.valueOf(x);
        String s3 = Integer.toString(x);
        System.out.println(x);

        //String to Primitive

        try{
            String a = "Shrikant";
            Integer b = Integer.parseInt(a);
        }
        catch(Exception e ) {
            System.out.println("Shrikants");

    }
}
}