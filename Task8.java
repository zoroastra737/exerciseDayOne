public class Task8 {
    public static void main(String[] args) {
        for (int i = 0; i <= 15; i++) {
            System.out.println(fizzBuzz(i));
        }

    }
        private static String fizzBuzz(int number){
        if (number %15==0){
                return "FizzBuzz";
            } else if (number%3==0) {
                return "Fizz";
            }else if (number%5==0){
                return "Buzz";
            }
          return String.valueOf(number);
        }
    }

