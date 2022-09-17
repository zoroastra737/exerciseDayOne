public class Task5d {
    public static void main(String[] args) {
        int firstDigit = 11;
        int secondDigit = 4;
        int sum = sumOfTheSequence(firstDigit, secondDigit);
        System.out.println("Sum: " + sum);
    }

    private static int sumOfTheSequence(int firstDigit,  int secondDigit) {
        int sum = 0;
        while (secondDigit <= firstDigit) ;
        {
            sum += secondDigit;
            secondDigit++;
        }
        return sum;

    }
}