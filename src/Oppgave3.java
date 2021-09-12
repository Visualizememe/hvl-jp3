
public class Oppgave3 {
	public static void main (String[] args) {
        long factorialResult = calculateFactorial(3);
        System.out.println("The factorial result is: " + factorialResult);
    }

    public static long calculateFactorial(int n) {
        if (n <= 1) {
            return n;
        }

        return n * calculateFactorial(n - 1);
    }
}
