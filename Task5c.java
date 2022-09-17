public class Task5c {
    public static void main(String[] args) {
        int firstDigit = 4;
        int secondDigit = 11;
        int sum = sumOfTheSequence(firstDigit, secondDigit);
        System.out.println("Sum: " + sum);
    }

    private static int sumOfTheSequence(int firstDigit,  int secondDigit) {
        int i = firstDigit;
        do {
            i += i;
            i++;
        } while (i <= secondDigit);

        return i;

    }}