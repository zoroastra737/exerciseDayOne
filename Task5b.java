public class Task5b {
    public static void main(String[] args) {
        int firstDigit = 4;
        int secondDigit = 11;
        int sum = sumOfTheSequence(firstDigit, secondDigit);
        System.out.println("Sum: " + sum);
    }

    private static int sumOfTheSequence(int firstDigit,  int secondDigit) {
        int sum = 0;
        while (firstDigit <= secondDigit) ;
        {
            sum += firstDigit;
            firstDigit++;
        }
        return sum;

    }
}