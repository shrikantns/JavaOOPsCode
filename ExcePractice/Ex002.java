package ExcePractice;

@SuppressWarnings("ALL")
public class Ex002 {
    public static void main(String[] args) {

        try {
            String ip = args[0];
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(String.valueOf(10 / a));
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
        } catch (ArithmeticException exception) {
            exception.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }
    }
}
