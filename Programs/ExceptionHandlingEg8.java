public class ExceptionHandlingEg8 {
    public static void main(String[] args) {
        String name = null;
        int n = 10;
        try {
            int len = name.length();
            n = n / 0;
        } catch (Exception e) {
            System.out.println("General Error");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error");
        } catch (NullPointerException e) {
            System.out.println("Null pointer error");
        }

    }
}
/*
 * ExceptionHandlingEg8.java:11: error: exception ArithmeticException has
 * already been caught
 * catch(ArithmeticException e){
 * ^
 * ExceptionHandlingEg8.java:14: error: exception NullPointerException has
 * already been caught
 * catch(NullPointerException e){
 * ^
 * 2 errors
 */
