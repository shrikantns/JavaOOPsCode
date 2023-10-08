package PolyMorOOPS;

public class Helper2 {
    static int multiply(int a , int b){
        return a * b;
    }
    static int Division(int a , int b){
        return a/b;
    }
    static double Multiply(double a, double b)
    {
        // Returns product of double numbers
        return a * b;
    }
}
class Pramod {
    public static void main(String[] args) {
        System.out.println(Helper2.multiply(4,5));
        System.out.println(Helper2.Division(10,2));
        System.out.println(Helper2.Multiply(45.5,87.5));
    }
}