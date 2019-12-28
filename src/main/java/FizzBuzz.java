public class FizzBuzz {
    public static StringBuffer of(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Invalid input");
        }
        StringBuffer s = new StringBuffer();
//        if(number%3 == 0 && number%5 == 0){
//            return "FizzBuzz";
//        }
        if (count(number, 3)) {
            s.append("Fizz");
        }
        if (count(number, 5)) {
            s.append("Buzz");
        }
        if (s.length() == 0) {
            s.append(number);
        }
        return s;
    }

    public static boolean count(int number, int i) {
        if (number % i == 0) {
            return true;
        } else return false;
    }

}
