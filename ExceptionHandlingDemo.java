public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int a = 10, b = 0;

        try {
            // Arithmetic Exception (division by zero)
            int result = a / b;  // ⚠️ This will throw ArithmeticException
            System.out.println("Result: " + result);

            // Array Index Out Of Bounds Exception
            System.out.println("Accessing element at index 10: " + numbers[10]);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught: Division by zero is not allowed.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception caught: Invalid array index.");
        } catch (Exception e) {
            System.out.println("General Exception caught: " + e);
        } finally {
            System.out.println("Finally block executed: Cleanup or closing resources can be done here.");
        }

        System.out.println("Program continues after exception handling...");
    }
}
