import java.util.function.BiFunction;
public class Main {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Long> countDigit = (x, digit) -> {
            return String.valueOf(x).chars()
                    .filter(ch -> ch == Character.forDigit(digit, 10))
                    .count();
        };
        int num = 223175632;
        int digitToCount = 2;
        long occurrences = countDigit.apply(num, digitToCount);
        System.out.println("Число вхождений цифры " + digitToCount + " в числе " + num + ": " + occurrences);
    }
}