package ExcePractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex005 {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "C:dog.txt";
        FileInputStream F = new FileInputStream(path);
    }
}
