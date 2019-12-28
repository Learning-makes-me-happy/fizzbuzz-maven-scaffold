public class FizzBuzz {
    public static String of(int number) {
        if(number == 1){
            return String.valueOf(number);
        }
        if(number == 3){
            return "Fizz";
        }
        return null;
    }
}
